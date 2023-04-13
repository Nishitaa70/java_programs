package com.oops.Properties.Polymorphism;

public class Circle extends Shapes{
    //this will run when obj of Circle is created
    //hence it is overriding the parent method
    @Override //this is called annotation, used when want to check whether the class is overridning or not
    void area(){
        System.out.println("Cricle area is pie * r * r");
    }
}
