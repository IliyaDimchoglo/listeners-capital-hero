package com.skySoft.vaultLogic.observers.capitalHero;

import com.skySoft.vaultLogic.observers.api.BaseSCEObserver;
import com.skySoft.vaultLogic.observers.api.EventFlowable;
import com.skysoft.vaultlogic.contracts.CapitalHero;
import com.skysoft.vaultlogic.contracts.CapitalHero.PreviewUrlEventResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
public class PreviewUrlEventObserver extends BaseSCEObserver<PreviewUrlEventResponse, CapitalHero> {
    @Autowired
    public PreviewUrlEventObserver(CapitalHero contract) {
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
    protected EventFlowable<PreviewUrlEventResponse> getEventFlowable() {
        return contract::previewUrlEventFlowable;
    }


    @Override
    public void onError(Throwable e) {
        log.error("[i] ERROR FILTERING FOR PREVIEW URL EVENT: {}", e);
    }

    @Override
    public void onNext(PreviewUrlEventResponse event) {
        log.info("[i] PREVIEW URL EVENT: sessionId {}, URL {}, log {} ", event.sessionId, event.url, event.log);
    }
}
