package com.oops.Properties.Inheritance;

public class Boxprice extends Boxweight {
    double cost;

    Boxprice(double h, double l, double w, double weight, double cost) {
        super(h, l, w, weight);
        this.cost = cost;
    }

    Boxprice() {
        this.cost = -2;
    }



}
