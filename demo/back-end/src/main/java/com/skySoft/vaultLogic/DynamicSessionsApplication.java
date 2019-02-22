package com.skySoft.vaultLogic;

import com.skysoft.vaultlogic.contracts.CapitalHero;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.web3j.protocol.http.HttpService;
import org.web3j.quorum.Quorum;
import org.web3j.quorum.tx.ClientTransactionManager;
import org.web3j.tx.gas.DefaultGasProvider;

import java.util.Objects;

import static org.web3j.protocol.core.DefaultBlockParameterName.LATEST;


@Slf4j
@SpringBootApplication
public class DynamicSessionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicSessionsApplication.class, args);
    }

    @Bean
    Quorum quorum() {
        return Quorum.build(new HttpService("http://35.184.180.245:22000"));
    }

    @Bean
    ClientTransactionManager txManager(Quorum quorum) {
        return new ClientTransactionManager(quorum, null, null, null);
    }

    @Bean
    CapitalHero capitalHero(Quorum quorum, ClientTransactionManager txManager) {
        return CapitalHero.load("0xb9955e4614e8574b14a580a28bc83ea404f25199", quorum, txManager, new DefaultGasProvider());
    }

    @Bean
    CommandLineRunner kioskInfoObserver(CapitalHero capitalHero) {
        return args -> capitalHero.kioskInfoEventFlowable(LATEST, LATEST).map(Objects::toString).subscribe(log::info, throwable -> log.error("", throwable));
    }

    @Bean
    CommandLineRunner qrScannedObserver(CapitalHero capitalHero) {
        return args -> capitalHero.qRScannedEventFlowable(LATEST, LATEST).subscribe(event -> {
            log.info("QR SCANNED: {}, {}", event.sessionId, event.token);
        }, throwable -> log.error("", throwable));
    }

}

