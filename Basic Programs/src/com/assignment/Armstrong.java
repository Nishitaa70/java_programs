package com.assignment;
import java.lang.Math;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // armstrong no whose sum of cubes of each digit is equal to it.
        System.out.println("Enter the number");
        int n = in.nextInt();
        int temp =n,ans=0;
         while(n>0){
             int rem = n%10;
             ans = (int) (ans + Math.pow(rem, 3)); //typecating done here float --> int
             n /= 10;
         }
         if(ans == temp){
             System.out.println("Armstrong Number");
         }
         else{
             System.out.println("Not armstrong number");
         }

    }
}
