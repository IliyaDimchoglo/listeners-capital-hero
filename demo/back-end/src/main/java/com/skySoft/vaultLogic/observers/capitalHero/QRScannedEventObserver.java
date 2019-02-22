package com.skySoft.vaultLogic.observers.capitalHero;

import com.skySoft.vaultLogic.observers.api.BaseSCEObserver;
import com.skySoft.vaultLogic.observers.api.EventFlowable;
import com.skysoft.vaultlogic.contracts.CapitalHero;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static com.skysoft.vaultlogic.contracts.CapitalHero.QRScannedEventResponse;

@Slf4j
@Component
public class QRScannedEventObserver extends BaseSCEObserver<QRScannedEventResponse, CapitalHero> {

    @Autowired
    public QRScannedEventObserver(CapitalHero contract) {
        super(contract);
    }

    @Override
    @PostConstruct
    protected void subscribe() {
        super.subscribe();
    }

    @PreDestroy
    private void unsubscribe() {
        this.disposable.dispose();
    }

    @Override
    protected EventFlowable<QRScannedEventResponse> getEventFlowable() {
        return contract::qRScannedEventFlowable;
    }

    @Override
    public void onError(Throwable e) {
        log.error("[i] ERROR FILTERING FOR QRScanned EVENT: {}", e);
    }

    @Override
    public void onNext(QRScannedEventResponse event) {
        log.info("[i] QRScanned event: sessionId {}, token {}, log {}", event.sessionId, event.token, event.log);
    }
}
