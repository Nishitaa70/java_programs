package com.nishita;

import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args)
    {
        System.out.println("Enter number to be reverse:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r,rev=0;

        while(n>0)
        {
         r = n%10;
         rev = (rev*10)+ r;
         n = n/10;
        }
        System.out.println(rev);
    }
}
