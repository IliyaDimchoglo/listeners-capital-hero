package com.skySoft.vaultLogic.observers.capitalHero;

import com.skySoft.vaultLogic.observers.api.BaseSCEObserver;
import com.skySoft.vaultLogic.observers.api.EventFlowable;
import com.skysoft.vaultlogic.contracts.CapitalHero;
import com.skysoft.vaultlogic.contracts.CapitalHero.CashOutValidationEventResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
public class CashOutValidationEventObserver extends BaseSCEObserver<CashOutValidationEventResponse, CapitalHero> {

    @Autowired
    public CashOutValidationEventObserver(CapitalHero contract) {
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
    protected EventFlowable<CashOutValidationEventResponse> getEventFlowable() {
        return contract::cashOutValidationEventFlowable;
    }

    @Override
    public void onError(Throwable e) {
        log.error("[i] ERROR FILTERING FOR CASH-OUT VALIDATION EVENT: {}", e);
    }

    @Override
    public void onNext(CashOutValidationEventResponse event) {
        log.info("[i] CASH OUT VALIDATION EVENT: " +
                        "sessionId {}," +
                        " channelId {}, " +
                        "success {}, " +
                        "log {}",
                event.sessionId,
                event.channelId,
                event.success,
                event.log);
    }
}
