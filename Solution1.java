package com.jimmychuang.tutorial.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> dict = new HashMap<Integer,Integer>();
        int result[] = new int [2];
        for (int i=0;i<nums.length;i++){
            if (dict.containsKey(target-nums[i]))
            {
                result[0]=dict.get(target-nums[i]);
                result[1]=i;
                break;
            }

            dict.put(nums[i],i);
        }
        return result;
    }


    public static void main(String[] args){
        Solution1 a = new Solution1();
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;


        System.out.println(Arrays.toString(a.twoSum(nums, target)));



    }




}
