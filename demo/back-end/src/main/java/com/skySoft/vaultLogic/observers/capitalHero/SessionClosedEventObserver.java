package com.skySoft.vaultLogic.observers.capitalHero;

import com.skySoft.vaultLogic.observers.api.BaseSCEObserver;
import com.skySoft.vaultLogic.observers.api.EventFlowable;
import com.skysoft.vaultlogic.contracts.CapitalHero;
import com.skysoft.vaultlogic.contracts.CapitalHero.SessionClosedEventResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
public class SessionClosedEventObserver extends BaseSCEObserver<SessionClosedEventResponse, CapitalHero> {

    @Autowired
    public SessionClosedEventObserver(CapitalHero contract) {
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
    protected EventFlowable<SessionClosedEventResponse> getEventFlowable() {
        return contract::sessionClosedEventFlowable;
    }

    @Override
    public void onError(Throwable e) {
        log.error("[i] ERROR FILTERING FOR SESSION CLOSED EVENT: {}", e);
    }

    @Override
    public void onNext(SessionClosedEventResponse event) {
        log.info("[i] SESSION CLOSED EVENT: sessionId {}, success{}, log {}", event.sessionId, event.success, event.log);
    }
}
