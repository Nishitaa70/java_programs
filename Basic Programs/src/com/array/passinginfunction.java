package com.array;
import java.util.*;

public class passinginfunction {
    public static int change(int arr[]){
        arr[0] = 67;
        return arr[0];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums[] = new int[5];

        System.out.println("Enter elements in array");
        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));





    }
}
