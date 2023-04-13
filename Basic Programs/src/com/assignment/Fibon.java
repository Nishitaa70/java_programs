package com.assignment;

import java.util.Scanner;

public class Fibon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=2, a=-1, b=1;
        while(count<=n){
            int t = b;
            b = a+b;
            a = t;
            count++;
            System.out.println(b);
        }
    }
}
