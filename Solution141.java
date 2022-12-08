package com.jimmychuang.tutorial.java;

public class Solution141 {
    public boolean hasCycle(ListNode head)
    {

        ListNode fastpointer = head;
        ListNode slowpointer = head;

        while (fastpointer != null && fastpointer.next != null)
        {
            slowpointer = slowpointer.next;
            fastpointer = fastpointer.next.next;

            if (slowpointer == fastpointer)
                {
                    return true;
                }



        }
        return false;

    }

    public static void main(String[] args) {
//        Solution141 a = new Solution141();
//        int[] list = new int[] {3,2,0,-4};
//        ListNode head = ListNode.build(list);
//        System.out.println(a.hasCycle(ListNode.build(list)));
          // 理論上來說會回傳true，但是設定有問題回傳false;
    }


}
