package com.jimmychuang.tutorial.java;

public class Solution169 {

    public int majorityElement(int[] nums){

        int n=nums.length;

        for(int i=0;i<nums.length;i++){
            int value=nums[i];
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==value) count++;
            }
            if(count>n/2) return value;
        }
        return -1;
    }


    public static void main(String[] args) {
        Solution169 a = new Solution169();
        int[] res = new int[] {2,2,1,1,1,2,2};

        System.out.println(a.majorityElement(res));
    }



    }


