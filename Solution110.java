package com.jimmychuang.tutorial.java;

import com.sun.source.tree.Tree;

public class Solution110 {

    public boolean isBalanced(TreeNode root) {

        if (root == null)
            return false;
       return true ;

    }

    public int Height(TreeNode root)
    {
        if (root == null)
            return 0;
        int leftheight = Height(root.left);

        int rightheight = Height(root.right);

        if (leftheight < 0 || rightheight < 0 )

            return -1;

        if (Math.abs( leftheight - rightheight )> 1)

            return -1;

        return 1 + Math.max(leftheight, rightheight);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        Solution110 a = new Solution110();
        System.out.println(a.isBalanced(root));
    }

}
