package com.reverse_linked_list;

import java.util.List;

/**
 * Created by shawn on 2017/4/4.
 */
public class TestSolution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        //ListNode c = new ListNode(7);
        //ListNode d = new ListNode(9);
        //ListNode e = new ListNode(3);
        head.next = a;
        a.next = b;
        //b.next = c;
        //c.next = d;
        //d.next = e;
        Solution s= new Solution();
        ListNode l = s.reverseBetween(head,1,2);
        ListNode p = head;
        for(int i = 0;i<3;i++){
            System.out.println(l.val);
            l = l.next;
        }
    }
}
