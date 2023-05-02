package com.assignment;
import java.util.*;
import java.io.*;

public class greaterThanprior {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int count = 1;

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i-1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
