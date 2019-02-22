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
public class ReceiptURLReceivedEventObserver extends BaseSCEObserver<ReceiptURLReceivedEventResponse, CapitalHero> {

    @Autowired
    public ReceiptURLReceivedEventObserver(CapitalHero contract) {
        super(contract);
    }

    @Autowired
    @PostConstruct
    protected void subscribe() {
        super.subscribe();
    }

    @PreDestroy
    private void unsubscribe() {
        this.disposable.dispose();
    }

    @Override
    protected EventFlowable<ReceiptURLReceivedEventResponse> getEventFlowable() {
        return contract::receiptURLReceivedEventFlowable;
    }

    @Override
    public void onError(Throwable e) {
        log.error("[i] ERROR FILTERING FOR RECEIPT URL RECEIVED EVENT: {} ", e);
    }

    @Override
    public void onNext(ReceiptURLReceivedEventResponse event) {
        log.info("[i] RECEIPT URL RECEIVED EVENT: " +
                        "sessionId {}, " +
                        "receipt {}, " +
                        "url {}, " +
                        "log {}  ",
                event.sessionId,
                event.receiptId,
                event.url,
                event.log);
    }
}
