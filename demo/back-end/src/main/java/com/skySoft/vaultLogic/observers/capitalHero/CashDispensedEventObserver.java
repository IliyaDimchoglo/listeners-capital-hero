package com.skySoft.vaultLogic.observers.capitalHero;

import com.skySoft.vaultLogic.observers.api.BaseSCEObserver;
import com.skySoft.vaultLogic.observers.api.EventFlowable;
import com.skysoft.vaultlogic.contracts.CapitalHero;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static com.skysoft.vaultlogic.contracts.CapitalHero.CashDispensedEventResponse;

@Slf4j
@Component
public class CashDispensedEventObserver extends BaseSCEObserver<CashDispensedEventResponse, CapitalHero> {

    @Autowired
    public CashDispensedEventObserver(CapitalHero contract) {
        super(contract);
    }

    @Override
    @PostConstruct
    protected void subscribe() {
        super.subscribe();
    }
    @PreDestroy
    private void unsubscribe(){
        this.disposable.dispose();
    }

    @Override
    protected EventFlowable<CashDispensedEventResponse> getEventFlowable() {
        return contract::cashDispensedEventFlowable;
    }

    @Override
    public void onError(Throwable e) {
        log.error("[i] ERROR FILTERING FOR CASH DISPENSED EVENT: {} ", e);

    }

    @Override
    public void onNext(CashDispensedEventResponse event) {
        log.info("[i] CASH DISPENSED EVENT: " +
                        "sessionId {}, " +
                        "channelId {}, " +
                        "dispensed_amount{}, " +
                        "requested_amount {}, " +
                        "log {} ",
                event.sessionId,
                event.channelId,
                event.dispensed_amount,
                event.requested_amount,
                event.log);
    }
}
