package com.jimmychuang.tutorial.java;

import java.util.ArrayList;
import java.util.List;

public class Solution94second {

    public List<Integer> inorderTraversal(TreeNode root)
    {

        List<Integer> result = new ArrayList<>();
        Traversal(root, result);
        return result;

    }

    public void Traversal(TreeNode root , List<Integer> result )
    {
        if (root == null) return ;
        if (root != null )
        {
            Traversal(root.left , result);
               result.add(root.val);
            Traversal(root.right , result);
            //Traversal(root.right.left , result);

        }


    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode();
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        Solution94second a = new Solution94second();

        System.out.println(a.inorderTraversal(root));
    }
}
