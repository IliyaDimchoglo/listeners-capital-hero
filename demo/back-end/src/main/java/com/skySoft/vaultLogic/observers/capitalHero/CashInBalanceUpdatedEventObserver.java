package com.skySoft.vaultLogic.observers.capitalHero;

import com.skySoft.vaultLogic.observers.api.BaseSCEObserver;
import com.skySoft.vaultLogic.observers.api.EventFlowable;
import com.skysoft.vaultlogic.contracts.CapitalHero;
import com.skysoft.vaultlogic.contracts.CapitalHero.CashInBalanceUpdatedEventResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
public class CashInBalanceUpdatedEventObserver extends BaseSCEObserver<CashInBalanceUpdatedEventResponse, CapitalHero> {

    @Autowired
    public CashInBalanceUpdatedEventObserver(CapitalHero contract) {
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
    protected EventFlowable<CashInBalanceUpdatedEventResponse> getEventFlowable() {
        return contract::cashInBalanceUpdatedEventFlowable;
    }

    @Override
    public void onError(Throwable e) {
        log.error("[i] ERROR FILTERING FOR CASH-IN BALANCE UPDATED EVENT: {}", e);
    }

    @Override
    public void onNext(CashInBalanceUpdatedEventResponse event) {
        log.info("[i] CASH IN BALANCE UPDATED EVENT: " +
                        "sessionId {}," +
                        " channelId {}," +
                        " balance {}, " +
                        "log {}",
                event.sessionId,
                event.channelId,
                event.balance,
                event.log);
    }
}
