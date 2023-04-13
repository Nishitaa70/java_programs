package com.oops;

// outer class can't be static
public class InnerClass {
    // if this class 'Test' is not dependent on the outer class then it will be executed easily
    static class Test{ // as this class is dependent on outer class so, it requires an object to get executed, hence using static
        String name;
        // static String name;

        public Test(String name) {
            this.name = name;
            // Test.name = name; will give only Aashita Sharma i.e b.name as output
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Nishita Sharma");
        Test b = new Test("Aashita Sharma");
        System.out.println(a.name);  // System is a class and out is the variable of the println is a method
        System.out.println(b.name);
    }
}


