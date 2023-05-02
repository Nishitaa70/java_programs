package com.assignment;
import java.util.*;

public class Nonprime {
    public static void main(String[] args) {
        int sum=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){
            int c = 0;
            for(int j = 1; j < n; j++){
                if(i%j == 0) {
                    c++;
                }
            }
            if(c != 2){
                sum += arr[i];
            }
        }
        System.out.println(sum);

    }

}
