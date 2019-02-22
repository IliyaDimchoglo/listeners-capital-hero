package com.skySoft.vaultLogic.observers.api;

public interface SCEObserver<E> {

    void onError(Throwable e);

    void onNext(E e);

}
