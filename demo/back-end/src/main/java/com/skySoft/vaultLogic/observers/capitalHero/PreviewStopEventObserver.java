package com.skySoft.vaultLogic.observers.capitalHero;

import com.skySoft.vaultLogic.observers.api.BaseSCEObserver;
import com.skySoft.vaultLogic.observers.api.EventFlowable;
import com.skysoft.vaultlogic.contracts.CapitalHero;
import com.skysoft.vaultlogic.contracts.CapitalHero.PreviewStopEventResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
public class PreviewStopEventObserver extends BaseSCEObserver<PreviewStopEventResponse, CapitalHero> {

    @Autowired
    public PreviewStopEventObserver(CapitalHero contract) {
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
    protected EventFlowable<PreviewStopEventResponse> getEventFlowable() {
        return contract::previewStopEventFlowable;
    }

    @Override
    public void onError(Throwable e) {
        log.error("[i] ERROR FILTERING FOR PREVIEW STOP EVENT: {}", e);
    }

    @Override
    public void onNext(PreviewStopEventResponse event) {
        log.info("[i] PREVIEW STOP EVENT: sessionId {}, success {}, log {}", event.sessionId, event.success, event.log);
    }
}
