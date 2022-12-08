package com.jimmychuang.tutorial.java;

public class Solution98 {


    private static Integer min;
    private static Integer max;

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }
    boolean isValidBST(TreeNode root, Integer min, Integer max) {
        if(root == null) return true;

        if((min != null && root.val <= min) || (max != null && root.val >= max))
            return false;

        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(-1);
        root.left.right = new TreeNode(-1);
//        root.left.right.left = new TreeNode(1);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

//        TreeNode min = new TreeNode(1);
//        TreeNode max = new TreeNode(6);
        Solution98  a = new Solution98();
        System.out.println(a.isValidBST(root.left, min , root.val)&& a.isValidBST(root.right, root.val ,max));
    }
}

