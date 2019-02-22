package com.skySoft.vaultLogic.observers.api;

import io.reactivex.disposables.Disposable;
import org.web3j.tx.Contract;

public abstract class BaseSCEObserver<E, C extends Contract> implements SCEObserver<E> {

    protected final C contract;
    protected Disposable disposable;

    public BaseSCEObserver(C contract) {
        this.contract = contract;
    }

    protected void subscribe() {
        this.disposable = getEventFlowable().latest().subscribe(this::onNext, this::onError);
    }

    protected abstract EventFlowable<E> getEventFlowable();

}
