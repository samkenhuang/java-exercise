package com.leetcode;

/**
 * Created by huangxin on 2017/6/28.
 * https://leetcode.com/problems/symmetric-tree/#/description
 */
public class SymmetricTree {
    public static void main(String[] args) {
        SolutionSymmetricTree s = new SolutionSymmetricTree();
        System.out.println(s.isSymmetric(new TreeNode(2, new TreeNode(6), new TreeNode(6))));
    }
}

class SolutionSymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        TreeNode left = root.left, right = root.right;
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        TreeNode combineInner = new TreeNode(left.val);
        combineInner.left = left.right;
        combineInner.right = right.left;
        TreeNode combineOutter = new TreeNode(left.val);
        combineOutter.left = left.left;
        combineOutter.right = right.right;
        return isSymmetric(combineInner) && isSymmetric(combineOutter);
    }
}
