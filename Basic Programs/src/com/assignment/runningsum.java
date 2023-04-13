package com.assignment;
import java.util.*;

public class runningsum {
    public static int[] solution(int[] nums){
        int m = nums.length;
        for(int i = 1; i < m; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   // size of array nums
        int[] nums = new int[n];
        for(int i = 0 ; i < n; i++){
            nums[i] = in.nextInt();
        }
        nums = solution(nums);
        System.out.println(Arrays.toString(nums));

    }
}
