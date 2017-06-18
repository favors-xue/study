package com.add_two_numbers;

/**
 * Created by shawn on 2017/5/31.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(0);
        ListNode head = p;
        int plus = 0;
        while(l1 != null){
          int val = l1.val + (l2 ==null?0:l2.val);
          if (plus>0) {
            val+=plus;
            plus--;
          }
          int ret = val;
          if(val >= 10){
            ret = val%10;
            plus++;
          }
          ListNode tmp = new ListNode(ret);
          p.next = tmp;
          p = p.next;
          l1 = l1.next;
          if (l2!=null)
            l2 = l2.next;
        }


      while(l2!=null) {
        int val = l2.val;
        if(plus>0) {
          val+=plus;
          plus--;
        }
        int ret = val;
        if (val >=10) {
          ret = val%10;
          plus++;
        }
        ListNode tmp = new ListNode(ret);
        p.next = tmp;
        p = p.next;
        l2 = l2.next;
      }

      if(plus>0) {
        ListNode tmp = new ListNode(1);
        p.next = tmp;
      }

      return head.next;
  }
}
