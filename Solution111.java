package com.jimmychuang.tutorial.java;

public class Solution111 {

    public int minDepth(TreeNode root) {

        if (root == null )
            return 0;
        if (root.left == null && root.right == null)
            return 1 ;
        if (root.left == null )
            return 1 +minDepth(root.right);
        if (root.right == null)
            return 1 + minDepth(root.left);
        //if (root.right != null &&　(root.left != null) && (root != 0)　) 會跟前面的程式碼衝突，所以省略即可
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));



    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);


        Solution111 a = new Solution111();
        System.out.println(a.minDepth(root));
    }

}
