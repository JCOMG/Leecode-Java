package com.jimmychuang.tutorial.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Integer candidateA = null;
        Integer candidateB = null;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0) {
                count1++;
                candidateA = nums[i];
            } else if (count2 == 0) {
                count2++;
                candidateB = nums[i];
            } else if (candidateA == nums[i]) {
                count1++;
            } else if (candidateB == nums[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i =0;  i < nums.length ;i++) {
            if (candidateA != null&& nums[i] == candidateA) {
                count1++;
            }
            if (candidateB != null &&nums[i] == candidateB) {
                count2++;
            }
        }
        if (count1 > nums.length / 3) {
            result.add(candidateA);
        }
        if (count2 > nums.length / 3) {
            result.add(candidateB);
        }

        return result;
    }


    public static void main(String[] args) {
        Solution229 a = new Solution229();
        int[] nums = new int[] {1,2,2,3,1,1,1,2,1};

        System.out.println(Arrays.toString(new List[]{a.majorityElement(nums)}));
    }
}