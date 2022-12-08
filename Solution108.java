package com.jimmychuang.tutorial.java;
import java.util.Arrays;

public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length == 0 || nums == null) return null;

        return CreateBST(nums, 0, nums.length-1);

    }

    public TreeNode CreateBST(int[] nums , int Left, int Right)
    {
        if (Left > Right) return  null;

        int medium = (Left+Right)/2;
        TreeNode root = new TreeNode(nums[medium]);
        root.left =  CreateBST(nums,  Left,  medium-1);
        root.right = CreateBST(nums,  medium+1, Right);
        return root;
    }

    public static void main(String[] args) {

        Solution108 a = new Solution108();
        TreeNode root = new TreeNode();
        root.left = new TreeNode(-3);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(-10);
//        root.left.right = new TreeNode(-1);
//        root.left.right.left = new TreeNode(1);
        root.right.left = new TreeNode(5);
//        root.right.right = new TreeNode(6);
//
////        TreeNode min = new TreeNode(1);
////        TreeNode max = new TreeNode(6);

        int[] nums = new int[]{-10,-3,0,5,9};
        System.out.println(Arrays.toString(new TreeNode[]{a.sortedArrayToBST(nums)}));
    }
}
