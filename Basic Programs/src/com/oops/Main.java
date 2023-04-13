package com.oops;

public class Main { // in this class will use the human class as this is the main class
    public static void main(String[] args) {
        Human nishita = new Human(20, "Nishita Sharma", 80000, false);
        Human aashi = new Human(17, "Aashita Sharma", 100000, false);
        Human manju = new Human(52, "Manju Gaur", 75000, true);
        System.out.println(nishita.name);
        System.out.println(aashi.population);

    }
}
