package com.reverse_linked_list1;

import com.reverse_linked_list1.ListNode;

/**
 * Created by shawn on 2017/4/4.
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        int index = 0;
        ListNode tail = head;
        while(tail.next != null) {
            index ++;
            tail = tail.next;
        }
        if (index == 0) return head;
        if (index == 1) {
            tail.next = head;
            head.next = null;
            return tail;
        }
        tail = new ListNode(0);
        tail.next = head;
        ListNode pre = tail;
        ListNode start = pre.next;
        ListNode next = start.next;
        for (int i =0 ;i<index;i++) {
            start.next = next.next;
            next.next = pre.next;
            pre.next = next;
            next = start.next;
        }

        return tail.next;

    }
}
