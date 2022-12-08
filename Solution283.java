package com.jimmychuang.tutorial.java;

import java.util.Arrays;

public class Solution283 {
    public int moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[index++] = nums[i];

        }
        while (index < nums.length) {
            nums[index++] = 0;

        }
        return nums[index-1];
    }


    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        Solution283 a = new Solution283();
        a.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}
