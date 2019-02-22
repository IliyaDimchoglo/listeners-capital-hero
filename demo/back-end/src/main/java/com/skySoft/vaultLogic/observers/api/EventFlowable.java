package com.skySoft.vaultLogic.observers.api;

import io.reactivex.Flowable;
import org.web3j.protocol.core.DefaultBlockParameter;

import static org.web3j.protocol.core.DefaultBlockParameterName.LATEST;

@FunctionalInterface
public interface EventFlowable<E> {

    Flowable<E> apply(DefaultBlockParameter from, DefaultBlockParameter to);

    default Flowable<E> latest() {
        return this.apply(LATEST, LATEST);
    }

}
