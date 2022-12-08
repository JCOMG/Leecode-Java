package com.jimmychuang.tutorial.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution94 {


    public List<Integer> inorderTraversal(TreeNode root)
    {
        // iterative method
       List <Integer> result = new ArrayList<>();
       Stack <TreeNode> stack = new Stack<>();

       TreeNode curr = root;

       while (curr != null || !stack.isEmpty())
       {
           while (curr != null)
           {
               stack.push(curr);
               curr = curr.left;

           }

           curr = stack.pop();
           result.add(curr.val);
           curr = curr.right;


       }
       return result;


    }

    public static void main(String[] args) {

        TreeNode curr = new TreeNode(1);
         curr.left = new TreeNode();
         curr.right = new TreeNode(2);
         curr.right.left = new TreeNode(3);
        Solution94 a = new Solution94();
        System.out.println(a.inorderTraversal(curr));
    }
}
