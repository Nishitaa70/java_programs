package com.assignment;
import java.util.*;
import java.util.Arrays;

public class concentratearr {
    public static int[] mix(int nums[]){
        int m = nums.length;
        int[] ans = new int[m+m];
        for( int i = 0; i < m; i++){
            ans[i] = nums[i];
            ans[i+m] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        nums = mix(nums);
        System.out.println(Arrays.toString(nums));

    }
}
