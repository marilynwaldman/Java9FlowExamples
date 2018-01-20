package com.mdw;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

/**
 * RxJava2 Reactive Programmaning - Observer Pattern - Java 9
 *
 * Given of list of dogparks, return the current number of dogs visiting
 * at the moment.
 *
 * ParkObservable - starts the feed accepting the list of parks
 * ParkObserver   - subscribes to the feed
 * DogPark        - Object being observed
 * DogParkService - Service to get current number of dogs
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        List<String> parks = Arrays.asList("Boulder", "Denver", "Durango");
        Observable<DogPark> observable = ParkObservable.getStream(parks);
        observable.subscribe(new ParkObserver());
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
