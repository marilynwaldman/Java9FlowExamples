package com.mdw;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ParkObserver implements Observer<DogPark> {


    @Override
    public void onComplete() {
        System.out.println("Done!");
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Got problem: " + throwable.getMessage());
    }

    @Override
    public void onSubscribe(Disposable disposable) {

    }

    @Override
    public void onNext(DogPark dogpark) {
        System.out.println(dogpark);
    }

}
