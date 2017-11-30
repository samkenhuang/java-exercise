package com.leetcode;

/**
 * Created by huangxin on 2017/3/29.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
    ListNode(int v, ListNode n) {
        val = v;
        next = n;
    }

    @Override
    public String toString() {
        if (next != null) return val + "->" + next.toString();
        return String.valueOf(val);
    }
}
