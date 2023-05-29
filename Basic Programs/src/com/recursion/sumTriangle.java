package com.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class sumTriangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] Arr = new int[n];
        for(int i = 0; i < Arr.length; i++){
            Arr[i] = in.nextInt();
        }
        solution(Arr);

    }
    static void solution(int[] Arr){

        // base condition
        if(Arr.length < 1){
            return;
        }

        //
        int[] temp = new int[Arr.length-1];
        for(int j = 0; j < Arr.length-1; j++){
            int x = Arr[j] + Arr[j+1];
            temp[j] = x;
        }
        solution(temp);
        System.out.println(Arrays.toString(Arr));

    }
}
