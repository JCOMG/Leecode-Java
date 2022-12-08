package com.jimmychuang.tutorial.java;

public class Solution96 {

    public int numTrees(int n) {
        int[] numsTrees = new int[n + 1];
        numsTrees[0] = 1; numsTrees[1] = 1; // init

        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) { // sum
                numsTrees[i] += numsTrees[j - 1] * numsTrees[i - j];
            }
        }
        return numsTrees[n];
    }


    public static void main(String[] args) {
        int n = 4 ;
        Solution96 a = new Solution96();
        System.out.println(a.numTrees(n));
    }
}
