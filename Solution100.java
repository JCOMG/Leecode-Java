package com.jimmychuang.tutorial.java;

public class Solution100 {

//      public static class TreeNode {
//          int val;
//          TreeNode left;
//          TreeNode right;
//          TreeNode() {}
//          //TreeNode(int val) { this.val = val; }
//          TreeNode(int val, TreeNode left, TreeNode right) {
//              this.val = val;
//              this.left = left;
//              this.right = right;
//          }
//      }


        public boolean isSameTree(TreeNode p, TreeNode q) {

            if (p == null && q == null)
                return true;
            if(p == null ||  q == null)
                return false;

            return isSameTree(p.left , q.left ) && isSameTree(p.right, q.right);


        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        // root.left.left = new TreeNode(4);
        // root.left.right = new TreeNode(5);
        // root.left.right.left = new TreeNode(1);
        // root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        //solution104 s = new solution104();
        //System.out.println(s.maxDepth(root));

        Solution100 a = new Solution100();
        System.out.println(a.isSameTree(root.left, root.right));
    }

    }


