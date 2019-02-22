package com.skySoft.vaultLogic.observers.capitalHero;

import com.skySoft.vaultLogic.observers.api.BaseSCEObserver;
import com.skySoft.vaultLogic.observers.api.EventFlowable;
import com.skysoft.vaultlogic.contracts.CapitalHero;
import com.skysoft.vaultlogic.contracts.CapitalHero.KioskInfoEventResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
public class KioskInfoEventObserver extends BaseSCEObserver<KioskInfoEventResponse, CapitalHero> {

    @Autowired
    public KioskInfoEventObserver(CapitalHero contract) {
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
    protected EventFlowable<KioskInfoEventResponse> getEventFlowable() {
        return contract::kioskInfoEventFlowable;
    }

    @Override
    public void onError(Throwable e) {
        log.error("[i] ERROR FILTERING FOR KIOSK-Info EVENT: {}", e);
    }

    @Override
    public void onNext(KioskInfoEventResponse event) {
        log.info("[i] KIOSK INFO EVENT:" +
                        " sessionId {}, " +
                        "id {}, " +
                        "name {}," +
                        " location {}, " +
                        "timeZone{}, " +
                        "bills {}," +
                        "billsCount {}, " +
                        "log {}",
                event.sessionId,
                event._id,
                event._name,
                event._location,
                event._timezone,
                event.bills,
                event.billsCount,
                event.log);

    }
}




