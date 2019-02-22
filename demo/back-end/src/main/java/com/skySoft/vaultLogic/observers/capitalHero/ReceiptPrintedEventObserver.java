package com.skySoft.vaultLogic.observers.capitalHero;

import com.skySoft.vaultLogic.observers.api.BaseSCEObserver;
import com.skySoft.vaultLogic.observers.api.EventFlowable;
import com.skysoft.vaultlogic.contracts.CapitalHero;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static com.skysoft.vaultlogic.contracts.CapitalHero.*;

@Slf4j
@Component
public class ReceiptPrintedEventObserver extends BaseSCEObserver<ReceiptPrintedEventResponse, CapitalHero> {

    @Autowired
    public ReceiptPrintedEventObserver(CapitalHero contract) {
        super(contract);
    }
    @Override
    @PostConstruct
    protected void subscribe(){ super.subscribe();}

    @PreDestroy
    private void unsubscribe(){ this.disposable.dispose();}

    @Override
    protected EventFlowable<ReceiptPrintedEventResponse> getEventFlowable() {
        return contract::receiptPrintedEventFlowable;
    }

    @Override
    public void onError(Throwable e) {
        log.error("[i] ERROR FILTERING FOR RECEIPT PRINTED EVENT: {} ", e);
    }

    @Override
    public void onNext(ReceiptPrintedEventResponse event) {
        log.info("[i] RECEIPT PRINTED EVENT:sessionId {}, success {}, log {}", event.sessionId, event.success,event.log);
    }
}
