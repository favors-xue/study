package com.reverse_linked_list;

/**
 * Created by shawn on 2017/4/4.
 *  Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) return null;
        if (head.next == null) return head;
        if (m == n) return head;
        if (head.next.next == null) {
            ListNode l = new ListNode(0);
            l.next = head.next;
            head.next.next = head;
            head.next = null;
            return l.next;
        }

        ListNode nHead = new ListNode(0);
        nHead.next = head;
        ListNode pre = nHead;
        for(int i=0;i<m - 1;i++) pre = pre.next;
        ListNode start = pre.next;
        ListNode next = start.next;
        for (int i=0;i<n-m;i++) {
            start.next = next.next;
            next.next = pre.next;
            pre.next = next;
            next = start.next;
        }
        return nHead.next;
    }
}
