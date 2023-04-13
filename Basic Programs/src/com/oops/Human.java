package com.oops;

public class Human {
    // this is a CLASS of name HUMAN
    int age;
    String name;
    int salary;
    boolean married;
    // here static is not really pointing to any object as it make it common for all
    static long population; // population is common to all the objects in class HUMAN

    // created a Constructor .... press alt + insert
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1; // using HUMAN class instead of this because it does not points to any specify object as common for all
    }
}
