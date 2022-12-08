package com.jimmychuang.tutorial.java;

public class Solution213 {

    public int rob(int[] nums) {

        int[] dp = new int[nums.length]; // dp =[0,0,0,0] nums=[1,2,3,4];

        int result1 =0;
        int result2 =0;
        int finalresult =0;


        if (nums.length == 0) return 0 ;
        if (nums.length == 1) return nums[0];


        //rob nums[0] house means we cannot rob the last house which is nums[nums.length -1]

        dp[0] = nums[0];
        dp[1] = nums[0]; //cannot rob nums[1] because we rob nums[0]

        for (int i = 2; i < nums.length-1; i++)
        {

            dp[i] = Math.max(nums[i]+dp[i-2] , dp[i-1]);

        }
            result1 = dp[nums.length-2];


        // do not rob nums[0] means we cannot rob the first house which is nums[0]
        dp[0] = 0;
        dp[1] = nums[1];//cannot rob nums[0], so we rob nums[1]

        for (int i = 2; i< nums.length; i++)
        {

            dp[i] = Math.max(nums[i]+dp[i-2] , dp[i-1]);

        }

        result2 = dp[nums.length-1];

        finalresult = Math.max(result1 , result2);

        return finalresult;

    }

    public static void main(String[] args) {

        Solution213 a = new Solution213();
        int[] nums = new int[] {1,2,3,1};

        System.out.println(a.rob(nums));
    }



    }
