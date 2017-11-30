package com.leetcode;

/**
 * Created by huangxin on 2017/5/10.
 */
public class SubtreeOfAnotherTree {
    public static void main(String[] args) {
        SolutionSubtreeOfAnotherTree s = new SolutionSubtreeOfAnotherTree();
        System.out.println(s.isEqual(new TreeNode(4, new TreeNode(1)), new TreeNode(4, new TreeNode(2))));
        System.out.println(s.isEqual(new TreeNode(4, new TreeNode(1, new TreeNode(2))), new TreeNode(4, new TreeNode(1, new TreeNode(2)))));

        TreeNode l = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5));
        TreeNode r = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        System.out.println(s.isSubtree(l, r));
        TreeNode l1 = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2, new TreeNode(0))), new TreeNode(5));
        TreeNode r1 = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        System.out.println(s.isSubtree(l1, r1));
        System.out.println(s.isSubtree(new TreeNode(1), new TreeNode(0)));
    }
}

class SolutionSubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (isEqual(s, t)) return true;
        else if(s.left == null && s.right == null) return false;
        boolean res = false;
        if (!res && s.left != null) {
            res = res || isSubtree(s.left, t);
        }
        if (!res && s.right != null) {
            res = res || isSubtree(s.right, t);
        }
        return res;
    }

    boolean isEqual(TreeNode s, TreeNode t) {
        if (s.left == null && s.right == null && s.val == t.val) {
            return true;
        } else if (s.val != t.val) {
            return false;
        }
        boolean res = true;
        if (res && s.left != null && t.left != null) {
            res = res && isEqual(s.left, t.left);
        }
        if (res && s.right != null && t.right != null) {
            res = res && isEqual(s.right, t.right);
        }
        if ((s.left == null && t.left != null) ||
                (s.right == null && t.right != null) ||
                (s.left != null && t.left == null) ||
                (s.right != null && t.right == null)) {
            res = res && false;
        }
        return res;
    }
}
