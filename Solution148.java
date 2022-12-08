package com.jimmychuang.tutorial.java;

import java.util.List;

public class Solution148 {

    public ListNode sortList(ListNode head) {

        return mergeSort(head);
    }

    public ListNode mergeSort (ListNode head){  // split our list 分開叫 mergesort  合併叫merge

        if ( head == null || head.next == null) return head;

        ListNode left = head;
        ListNode middle = getMiddle(head);
        ListNode right = middle.next;
        middle.next = null ;

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left , right);
    }

    public  ListNode getMiddle(ListNode head){

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast= fast.next.next;

        }
        return slow;

    }

    public ListNode merge(ListNode list1 , ListNode list2){

        ListNode tail = new ListNode();
        ListNode dummy = new ListNode();

        while(list1 != null && list2 != null) {


            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            }

            if (list1.val > list2.val) {
                tail.next = list2;
                list2 = list2.next;

            }

            tail = tail.next;


        }

        if (list1 != null) return tail.next=list1;
        if (list2 != null) return tail.next=list2;

        return dummy.next;

    }


    public static void main(String[] args) {

        Solution148 a = new Solution148();
        int[] nums = new int[] { 4,2,1,3 };

        ListNode root = ListNode.build(nums);

        System.out.println(a.sortList(root));
    }
}
