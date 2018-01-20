package com.mdw;

import io.reactivex.Observable;

import java.util.List;


public class ParkObservable {

    public static Observable getStream(List<String> parks){
        return Observable.create(subscriber -> {
                    try {

                        while (!subscriber.isDisposed()) {

                            parks.stream()
                                    .map(DogPark::fetch)
                                    .forEach(subscriber::onNext);
                            Thread.sleep(1000);
                        }
                    } catch (Exception e) {
                        subscriber.onError(e);
                    }


                }
        );}
}
