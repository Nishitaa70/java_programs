package com.oops.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance(); // as acessing this getInstance function via class name so put static in that function

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        // it will give the same instance/ object to all three reference variable present here.

    }
}
