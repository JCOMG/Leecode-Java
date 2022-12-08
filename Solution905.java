package com.jimmychuang.tutorial.java;

import java.util.Arrays;

public class Solution905 {

    public int[] sortArrayByParity(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {

                if (nums[i] % 2 ==0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                        j++;
                    }

                    }
                return nums;
            }









    public static void main(String[] args) {
        Solution905 a = new Solution905();
        int[] nums = new int[]{3,1,2,4};

        System.out.println(Arrays.toString(a.sortArrayByParity(nums)));
    }
}
