package com.skySoft.vaultLogic.configuration;

import com.skysoft.vaultlogic.contracts.CapitalHero;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class ContractConfiguration {

    @Bean
    public CapitalHero capitalHero() {
        return null;
    }

}
