package com.skySoft.vaultLogic.observers.capitalHero;

import com.skySoft.vaultLogic.observers.api.BaseSCEObserver;
import com.skySoft.vaultLogic.observers.api.EventFlowable;
import com.skysoft.vaultlogic.contracts.CapitalHero;
import com.skysoft.vaultlogic.contracts.CapitalHero.CashOutOpenedEventResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
public class CashOutOpenedEventObserver extends BaseSCEObserver<CashOutOpenedEventResponse, CapitalHero> {

    @Autowired
    public CashOutOpenedEventObserver(CapitalHero contract) {
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
    protected EventFlowable<CashOutOpenedEventResponse> getEventFlowable() {
        return contract::cashOutOpenedEventFlowable;
    }

    @Override
    public void onError(Throwable e) {
        log.error("[i] ERROR FILTERING FOR CASH-OUT OPENED EVENT: {}", e);

    }

    @Override
    public void onNext(CashOutOpenedEventResponse event) {
        log.info("[i] CASH OUT OPENED EVENT: " +
                        "channelId {}," +
                        "requestedId {}, " +
                        "vlFee {}, " +
                        "success {}, " +
                        "log {} ",
                event.channelId,
                event.requestId,
                event.vlFee,
                event.success,
                event.log);
    }
}
