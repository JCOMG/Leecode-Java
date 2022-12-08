package com.jimmychuang.tutorial.java;

import java.util.Stack;



public class Solution206 {

      //Definition for singly-linked list.
      public static class ListNode{
          int val;
          ListNode next;
          ListNode(int i, int i1, int i2, int i3, int i4) {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode reverseList(ListNode head)

    {

        Stack<ListNode> stack206 = new Stack<ListNode>();

        while (head != null)
        {
            stack206.push(head);
            head = head.next;
        }

        ListNode dummy = new ListNode(-1);
        head = dummy ;
        ListNode current = stack206.pop();
        while (!stack206.empty())
        {
            head.next = new ListNode(current.val);
            head = head.next;
        }

        return dummy.next;






    }


    public static void main(String[] args) {


        Solution206 a = new Solution206();

        ListNode head = new ListNode(1,2,3,4,5);
        System.out.println(a.reverseList(head));

    }

}


