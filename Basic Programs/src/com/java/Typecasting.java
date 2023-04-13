package com.java;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = (int)(64.56f); // explicit type casting
        System.out.println(num);

        //automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); // 257 % 256(range of byte datatype) =1
        System.out.println(b);
    }
}
