package com.skySoft.vaultLogic.observers.capitalHero;

import com.skySoft.vaultLogic.observers.api.BaseSCEObserver;
import com.skySoft.vaultLogic.observers.api.EventFlowable;
import com.skysoft.vaultlogic.contracts.CapitalHero;
import com.skysoft.vaultlogic.contracts.CapitalHero.CashOutClosedEventResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
public class CashOutClosedEventObserver extends BaseSCEObserver<CashOutClosedEventResponse, CapitalHero> {

    @Autowired
    public CashOutClosedEventObserver(CapitalHero contract) {
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
    protected EventFlowable<CashOutClosedEventResponse> getEventFlowable() {
        return contract::cashOutClosedEventFlowable;
    }

    @Override
    public void onError(Throwable e) {
        log.error("[i] ERROR FILTERING FOR CASH-OUT CLOSED EVENT: {}", e);

    }

    @Override
    public void onNext(CashOutClosedEventResponse event) {
        log.info("[i] CASH OUT CLOSED EVENT: " +
                        "sessionId {}, " +
                        "channelId {}, " +
                        "success {}, " +
                        "log {}",
                event.sessionId,
                event.channelId,
                event.success,
                event.log);

    }
}
