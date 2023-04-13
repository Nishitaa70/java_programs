package com.java;


import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        /*
        for loop syntax (used when number to execute the loop is known to us)
        for(initialisation; condition check; increment/decrement){
           //body
        }
         */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i < n; i++) {
            //System.out.println("Nishita");
        }

        /* While loop Syntax (used when dont know number of times to execute loop)

         initialisation;
         while(condition){
            //body;
            increment/decrement;
         }
         */

        int num = 1;
        while(num <= n){
            //System.out.println(num);
            num++;
        }

        /*
        Do while Syntax
        do{
           //body
        } while (condition);
         */

        int a = 1;
        do{
            System.out.println(a);
            a++;
        } while(a <= n);
    }
}
