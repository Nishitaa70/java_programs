package com.oops.Properties.Inheritance;

// it inherit the properties of class Box using extend keyword
public class Boxweight extends Box{
    double weight;

    public Boxweight() {
        this.weight = 3;
    }
    public Boxweight(double h, double l, double w, double weight) {
        // super is used to initialize values present in the parent class
        super(h, l, w); // here super is saying call the parent class constructor
        //System.out.println(super.weight);

        this.weight = weight;
    }

    public Boxweight(double weight) {
        this.weight = weight;
    }
}
