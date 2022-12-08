package com.jimmychuang.tutorial.java;

import org.w3c.dom.Node;

public class Solution700 {

    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) return null;

        while(root != null)
        {
            if (val > root.val)
                root = root.right;
            else if (val < root.val)
                root = root.left;
           else if (val == root.val)
               return root;

        }

        return null;


    }

    public static void main(String[] args) {
        Solution700 a = new Solution700();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
//        root.left.right.left = new TreeNode(5);
        root.right = new TreeNode(7);
//        root.right.right = new TreeNode(8);
//        root.right.right.left = new TreeNode(7);
//        root.right.right.right = new TreeNode(9);
        System.out.println(a.searchBST(root, 2).val);//searchBST 這個function他回傳的是一個TreeNode的object，你直接print object 他會印出記憶體位置給你,加上.val即可
    }
}
