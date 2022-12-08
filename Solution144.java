package com.jimmychuang.tutorial.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution144 {

    //iterative
//    public List<Integer> preorderTraversal(TreeNode root) {
//
//        List<Integer> result = new ArrayList<>();
//
//        if (root == null) return result;
//
//
//        Stack<TreeNode> stack = new Stack<>();
//
//        stack.push(root);
//
//
//        while (!stack.empty()) {
//
//            TreeNode currentNode = root;
//
//            currentNode = stack.pop();
//
//            result.add(currentNode.val);
//
//            if (currentNode.right != null)
//                stack.push(currentNode.right);
//
//            if (currentNode.left != null)
//                stack.push(currentNode.left);
//        }
//
//        return result;
//    }
//          recursion
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        dfs(root, result);
        return result;
    }
        public void dfs (TreeNode root,List <Integer> result)
        {

        if (root == null) return;

        else
        {
            result.add(root.val);
            dfs(root.left,result);
            dfs(root.right,result );

        }


    }







        public static void main (String[]args){
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.left.left = new TreeNode(3);
            root.left.right = new TreeNode(4);
            root.left.right.left = new TreeNode(5);
//        root.right = new TreeNode(6);
//        root.right.right = new TreeNode(8);
//        root.right.right.left = new TreeNode(7);
//        root.right.right.right = new TreeNode(9);
            Solution144 a = new Solution144();
            System.out.println(a.preorderTraversal(root));
        }
    }


