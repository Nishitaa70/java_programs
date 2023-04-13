package com.array;
import java.util.Scanner;


public class Arrayinput {
    public static void main(String[] args) {
        /* syntax of array-
           dataype variablename[] = new datatype[size];

         */
        int arr[] = new int[5];           // array arr declare with size
        int arr2[] = {2, 4, 5, 4,6};      // declaring of values in array
       //  declaring of values separatly.
        arr[0]= 3;
        arr[1]= 91;
        arr[2]= 78;
        arr[3]= 367;
        arr[4]= 43;

        System.out.println("Enter elements in array");
        Scanner input = new Scanner(System.in);

        for(int i = 0; i< arr.length; i++){
            //System.out.print(arr[i] + " ");
            //System.out.print(arr2[i] + " ");   // loop to print all values
            arr[i] = input.nextInt();            // input from keyboard
            System.out.println(arr[i] + " ");
        }


    }
}
