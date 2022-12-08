package com.jimmychuang.tutorial.java;

public class Solution92 {

         public ListNode reverseBetween(ListNode head, int left, int right) {

            ListNode dummy = new ListNode(0,head);
            ListNode Leftpre = dummy;
            ListNode cur = head;



            for (int i = 0 ; i < left - 1; i++)
            {
                Leftpre = cur ;
                cur = cur.next ;

            }

            ListNode pre = null ;


            for (int i = 0 ; i< right - left +1 ; i++)
            {
                ListNode temp = cur.next ;
                cur.next = pre ;
                pre = cur ;
                cur = temp ;


            }

            Leftpre.next.next = cur;
            Leftpre.next = pre ;
            return dummy.next ;

        }


    public static void main(String[] args) {
          int[] list = new int[] {1,2,3,4,5};
          ListNode head = ListNode.build(list);
          Solution92 a = new Solution92();

        ListNode bb = a.reverseBetween(ListNode.build(list) , 2,4);
        ListNode.printList(bb);
    }
    }

