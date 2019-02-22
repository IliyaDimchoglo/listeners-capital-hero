package com.skySoft.vaultLogic.observers.capitalHero;

import com.skySoft.vaultLogic.observers.api.BaseSCEObserver;
import com.skySoft.vaultLogic.observers.api.EventFlowable;
import com.skysoft.vaultlogic.contracts.CapitalHero;
import com.skysoft.vaultlogic.contracts.CapitalHero.CashInOpenedEventResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
public class CashInOpenedEventObserver extends BaseSCEObserver<CashInOpenedEventResponse, CapitalHero> {

    @Autowired
    public CashInOpenedEventObserver(CapitalHero contract) {
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
    protected EventFlowable<CashInOpenedEventResponse> getEventFlowable() {
        return contract::cashInOpenedEventFlowable;
    }

    @Override
    public void onError(Throwable e) {
        log.error("[i] ERROR FILTERING FOR CASH-IN OPENED EVENT: {}", e);

    }

    @Override
    public void onNext(CashInOpenedEventResponse event) {
        log.info("[i] CASH IN OPENED EVENT: sessionId {}, chanelId {}, log {} ", event.sessionId, event.channelId, event.log);
    }

}
