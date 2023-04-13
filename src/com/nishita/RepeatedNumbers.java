package com.nishita;

import java.util.Scanner;

public class RepeatedNumbers
{
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while(n>0)
        {
            int r = n%10; //last digit
            if (r == 7)
            {
                count++;
            }
            n = n/10;
        }
        System.out.print(count);
    }
}
