package com.jimmychuang.tutorial.java;

public class Solution101 {


    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

        public boolean isSymmetric(TreeNode root) {
        if (root == null )
            return true;

        return isSymmetric(root.left, root.right);

        }


     boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left.left == right.left && left.right == right.right)
            return true;
        if (left.val != right.val)
            return false;
        return isSymmetric(left.left, right.left) && isSymmetric(left.right, right.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
         root.left.left = new TreeNode(4);
         root.left.right = new TreeNode(5);
         //root.left.right.left = new TreeNode(1);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution101 a = new Solution101();

        System.out.println(a.isSymmetric(root.left, root.right)&&a.isSymmetric(root.left.left,root.right.left) && a.isSymmetric(root.left.right ,root.right.right));
    }
}
