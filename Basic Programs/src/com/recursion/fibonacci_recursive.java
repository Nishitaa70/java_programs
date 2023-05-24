package com.recursion;

import java.util.Scanner;

public class fibonacci_recursive {
    //a series of numbers in which each number ( Fibonacci number )
    // is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.
    // 0th 1st 2nd 3rd 4th 5th 6th 7th 8th 9th 10th ......
    // 0    1   1   2   3   5   8   13  21  34   55
    public static void main(String[] args){
        System.out.println("Fibonacci Numbers:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(fibonacci_num(num));
    }
    static int fibonacci_num(int n){
        if(n < 2){
            return n;
        }

        return fibonacci_num(n-1) + fibonacci_num(n-2);
    }
}
