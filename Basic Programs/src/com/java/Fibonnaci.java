package com.java;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=-1,b=1,count=2;

        while(count <=n){
            int t=b;
            b = a+b;
            a = t;
            count++;
            System.out.println(b);
        }


    }
}
