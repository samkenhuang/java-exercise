package com.leetcode;

import com.leetcode.ListNode;

class SolutionAddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val, val1, val2;
        val1 = l1 != null ? l1.val : 0;
        val2 = l2 != null ? l2.val : 0;
        val = val1 + val2;
        boolean gotTen = (val >= 10) ? true : false;
        ListNode head = new ListNode(val % 10);

        ListNode copyNode = head, iter1 = l1.next, iter2 = l2.next;

        while(iter1 != null || iter2 != null || gotTen) {
            val1 = iter1 != null ? iter1.val : 0;
            val2 = iter2 != null ? iter2.val : 0;
            val = gotTen ? (val1 + val2 + 1) : (val1 + val2);
            gotTen = (val >= 10) ? true : false;
            copyNode.next = new ListNode(val % 10);
            copyNode = copyNode.next;
            iter1 = iter1 != null ? iter1.next : null;
            iter2 = iter2 != null ? iter2.next : null;
        }

        return head;
    }
}

public class AddTwoNumbers {
    public static void main(String[] argv) {
        SolutionAddTwoNumbers s = new SolutionAddTwoNumbers();

        ListNode l1 = new ListNode(3);
        ListNode m1 = new ListNode(8);
        ListNode n1 = new ListNode(5);
        l1.next = m1;
        m1.next = n1;

        ListNode l2 = new ListNode(4);
        ListNode m2 = new ListNode(2);
        ListNode n2 = new ListNode(1);
        l2.next = m2;
        m2.next = n2;

        ListNode res = s.addTwoNumbers(l1, l2);
        System.out.println(res.val);
        System.out.println(res.next.val);
        System.out.println(res.next.next.val);
    }
}