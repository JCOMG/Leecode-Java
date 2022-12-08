package com.jimmychuang.tutorial.java;

import java.util.Arrays;

import static java.lang.Math.abs;

public class Solution977 {

    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length -1 ;
        int index = nums.length -1 ;

        int[] result = new int[nums.length];

        while (left <= right)
        {
            if (Math.abs(nums[right]) > Math.abs(nums[left]))
            {
                result[index] = nums[right]*nums[right];
                right--;
            }
            else
            {
                result[index] = nums[left]*nums[left];
                left++;

            }
            index--;

        }
        return result;
    }

        // brutal force
//        for (int i = 0; i< nums.length; i++)
//        {
//            nums[i] = nums[i]*nums[i];
//
//        }
//        Arrays.sort(nums);
//        return nums;


//    }


        public static void main (String[]args){
            Solution977 a = new Solution977();
            int[] nums = new int[]{-4, -1, 0, 3, 10};

            System.out.println(Arrays.toString(a.sortedSquares(nums)));
        }
    }
