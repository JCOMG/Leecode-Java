package com.jimmychuang.tutorial.java;

import java.util.Arrays;

public class Solution189 {

    public static void reverse(int nums[], int i, int j){
        int li = i;
        int ri = j;

        while(li < ri){
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;

            li++;
            ri--;
        }
    }
    public int[] rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k < 0){
            k += nums.length;
        }
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
        return nums;
    }


        public static void main (String[]args){
        int[] res = new int[]{1, 2, 3, 4, 5, 6, 7};
        Solution189 a = new Solution189();

        System.out.println(Arrays.toString(a.rotate(res, 3)));
    }
}
