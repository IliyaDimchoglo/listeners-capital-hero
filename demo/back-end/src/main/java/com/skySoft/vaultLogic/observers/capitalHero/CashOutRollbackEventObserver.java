package com.skySoft.vaultLogic.observers.capitalHero;

import com.skySoft.vaultLogic.observers.api.BaseSCEObserver;
import com.skySoft.vaultLogic.observers.api.EventFlowable;
import com.skysoft.vaultlogic.contracts.CapitalHero;
import com.skysoft.vaultlogic.contracts.CapitalHero.CashOutRollbackEventResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
public class CashOutRollbackEventObserver extends BaseSCEObserver<CashOutRollbackEventResponse, CapitalHero> {

    @Autowired
    public CashOutRollbackEventObserver(CapitalHero contract) {
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
    protected EventFlowable<CashOutRollbackEventResponse> getEventFlowable() {
        return contract::cashOutRollbackEventFlowable;
    }

    @Override
    public void onError(Throwable e) {
        log.error("[i] ERROR FILTERING FOR CASH-OUT ROLLBACK EVENT: {} ", e);
    }

    @Override
    public void onNext(CashOutRollbackEventResponse event) {
        log.info("[i] CASH OUT ROLLBACK EVENT: channelId {}, success {}, log {}", event.channelId, event.success, event.log);
    }
}
