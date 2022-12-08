package com.jimmychuang.tutorial.java;

import java.util.HashMap;
import java.util.Map;

public class Solution169second {

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
               int times = map.get(nums[i]);
                map.put(nums[i], times + 1);
            }
        }
        // int maxValueInMap = (Collections.max(map.values()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 2, 1, 1, 1, 2, 2 };
        Solution169second  a = new Solution169second();
        System.out.println(a.majorityElement(arr));
    }
}

