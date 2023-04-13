package com.array;
import java.util.*;

public class Twodimension {
    public static void main(String[] args) {
        // to declare and initialize the 2d array

        // int arr[][] = new int[3][3];    //declaration with size
        int arr[][] ={
            {1, 2, 3},           // initialization
            {4, 5, 6},
            {7, 8, 9}
        };

        for( int i = 0; i < arr.length; i++){
            for(int j =0; j < arr.length; j++){
                System.out.print(arr[i][j] + " " );
            }
        }
    }
}
