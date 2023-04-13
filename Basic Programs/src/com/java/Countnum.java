package com.java;
import java.util.Scanner;
public class Countnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        System.out.println("Enter number to find count");
        int d = in.nextInt();

        int count=0;
        while(n>0){
            int rem = n%10;
            if(rem == d){
                count++;

            }
            n = n/10;
        }
        System.out.println(count);
    }
}
