package com.leetcode;

/**
 * Created by huangxin on 2017/5/10.
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    TreeNode(int x, TreeNode Left) {
        val = x;
        left = Left;
    }
    TreeNode(int x, TreeNode Left, TreeNode Right) {
        val = x;
        left = Left;
        right = Right;
    }
}
