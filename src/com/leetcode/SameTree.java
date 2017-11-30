package com.leetcode;

/**
 * Created by huangxin on 2017/6/28.
 * https://leetcode.com/problems/same-tree/#/description
 */
public class SameTree {
    public static void main(String[] args) {
        SolutionSameTree s = new SolutionSameTree();
        System.out.println(s.isSameTree(new TreeNode(2, new TreeNode(3)), new TreeNode(2, new TreeNode(3))));

    }
}

class SolutionSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
