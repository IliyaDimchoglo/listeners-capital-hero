package com.skySoft.vaultLogic.observers.capitalHero;

import com.skySoft.vaultLogic.observers.api.BaseSCEObserver;
import com.skySoft.vaultLogic.observers.api.EventFlowable;
import com.skysoft.vaultlogic.contracts.CapitalHero;
import com.skysoft.vaultlogic.contracts.CapitalHero.CashInClosedEventResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
public class CashInClosedEventObserver extends BaseSCEObserver<CashInClosedEventResponse, CapitalHero> {

    @Autowired
    public CashInClosedEventObserver(CapitalHero contract) {
        super(contract);
    }

    @Override
    @PostConstruct
    protected void subscribe() {
        super.subscribe();
    }

    @PreDestroy
    private void unsubscribe() {
        super.disposable.dispose();
    }

    @Override
    protected EventFlowable<CashInClosedEventResponse> getEventFlowable() {
        return contract::cashInClosedEventFlowable;
    }

    @Override
    public void onError(Throwable e) {
        log.error("[i] ERROR FILTERING FOR CASH-IN CLOSED EVENT: {}", e);

    }

    @Override
    public void onNext(CashInClosedEventResponse event) {
        log.info("[i] CASH IN CLOSED EVENT: " +
                        "sessionId {}," +
                        " channelId {}," +
                        " success {}," +
                        " log {}",
                event.sessionId,
                event.channelId,
                event.success,
                event.log);

    }
}
