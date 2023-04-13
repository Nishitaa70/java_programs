package com.assignment;

import java.util.Scanner;

public class Pallidrome {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rev = 0,t=n;   // t= n because after loop execution n value becomes 0

        while(n>0) {

            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;

        }
            if(rev == t){
                System.out.println("Palindrome Number");
            }
            else{
                System.out.println("Not Palindrome");
            }


    }
}
