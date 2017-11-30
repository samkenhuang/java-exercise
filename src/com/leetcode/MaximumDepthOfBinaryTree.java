package com.leetcode;

/**
 * Created by huangxin on 2017/6/28.
 */
public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        SolutionMaximumDepthOfBinaryTree s = new SolutionMaximumDepthOfBinaryTree();
        System.out.println(s.maxDepth(new TreeNode(3, new TreeNode(4, new TreeNode(5)))));
    }
}

class SolutionMaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        if (root.left == null) return 1 + maxDepth(root.right);
        if (root.right == null) return 1 + maxDepth(root.left);
        return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
    }
}