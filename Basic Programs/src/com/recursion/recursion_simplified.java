package com.recursion;

public class recursion_simplified {
    public static void main(String[] args) {
        System.out.println("Print 5 numbers");
        print(1);
    }
    // since in the basic recursion example the body of all the func were same except the last one
    static void  print(int n){
        if(n == 6){
            // as we want to print only til 5th number
            return;
        }
        System.out.println(n);

        // this is tail recursion as it is the last function to be called
        print(n+1); // increment of numbers
    }
}
