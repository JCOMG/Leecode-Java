package com.jimmychuang.tutorial.java;

public class Solution136 {

    public static int solveUsingTwoPointer(int[] nums){
        int i= 0,j=nums.length-1;
        while(i<nums.length && j>=0){
            if(nums[i] != nums[j] || i == j){
                j--;
            }
            else if(nums[i] == nums[j] && i!=j){
                i++;
                j = nums.length-1;
            }
        }
        return nums[i];
    }

    public static void main(String[] args) {

        int[] nums = new int[] {4,1,2,1,2 };
        Solution136 a = new Solution136();
        System.out.println(a.solveUsingTwoPointer(nums));
    }
}
