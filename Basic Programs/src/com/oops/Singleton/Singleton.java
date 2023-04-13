package com.oops.Singleton;

public class Singleton {
    private Singleton(){

    }
    // one instance can be created
    private static Singleton instance; //since it is not dependent on above class so put static here as well

    //create a function which gives you an instance
    public static Singleton getInstance(){
        // check whether 1 object is created or not
        if(instance == null){
            instance = new Singleton();
        }
        return instance;

    }
}
