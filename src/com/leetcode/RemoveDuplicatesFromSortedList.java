package com.leetcode;

/**
 * Created by huangxin on 2017/6/27.
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/#/description
 */
public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        SolutionRemoveDuplicatesFromSortedList s = new SolutionRemoveDuplicatesFromSortedList();
        System.out.println(s.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2)))));
        System.out.println(s.deleteDuplicates(new ListNode(1, new ListNode(3, new ListNode(2)))));
        System.out.println(s.deleteDuplicates(new ListNode(1, new ListNode(2, new ListNode(2)))));
    }
}

class SolutionRemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode res = new ListNode(head.val);
        ListNode last = res;
        while (head.next != null) {
            head = head.next;
            if (last.val != head.val) {
                ListNode newNode = new ListNode(head.val);
                last.next = newNode;
                last = last.next;
            }
        }
        return res;
    }
}