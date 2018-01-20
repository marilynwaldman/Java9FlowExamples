package com.mdw;

public class DogParkService {
    public static int getNumDogs(String name){
        if(name.equals("Boulder"))return 25;
        if(name.equals("Denver"))return 50;
        if(name.equals("Durango"))return 100;
        return 0;
    }
}
