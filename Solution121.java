package com.jimmychuang.tutorial.java;

public class Solution121 {
    public int maxProfit(int[] prices) {


        if (prices == null || prices.length <= 1) return 0;


        int miniBuy = prices[0];


        int maxProfit = 0;

        for (int i = 1; i < prices.length ; i++) {

            miniBuy = Math.min(miniBuy , prices[i]);

            maxProfit = Math.max(maxProfit , prices[i] - miniBuy);

        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{7,1,5,3,6,4};
        Solution121 a = new Solution121();
        System.out.println(a.maxProfit(nums));
    }
}
