package com.jimmychuang.tutorial.java;

public  class Solution136second {

    public static int singleNumber(int[] nums) {
    int XOR =0;

    for (int n=0; n<nums.length;n++ )
    {
        XOR = XOR ^ n;

    }
        return XOR;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {4,1,2,1,2 };
        Solution136second a = new Solution136second();
        System.out.println(a.singleNumber(nums));
    }



}
