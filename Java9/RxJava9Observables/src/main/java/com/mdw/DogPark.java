package com.mdw;

public class DogPark {

    public final String name;

    public int numDogs;

    public DogPark(String name, int numDogs) {
        this.name = name;
        this.numDogs = DogParkService.getNumDogs(name);
    }

    public static DogPark fetch(String name) {
        return new DogPark(name, DogParkService.getNumDogs(name));
    }

    @Override
    public String toString(){
        return String.format("%s : %d", name, numDogs);
    }


}
