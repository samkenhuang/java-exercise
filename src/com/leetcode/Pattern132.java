package com.leetcode;

/**
 * Created by huangxin on 2017/5/16.
 * https://leetcode.com/problems/132-pattern/#/description
 */
public class Pattern132 {
    public static void main(String[] args) {
        SolutionPattern132 s = new SolutionPattern132();
        System.out.println(s.find132pattern(new int[]{-2,1,2,-2,1,2})); // true
        System.out.println(s.find132pattern(new int[]{1, 2, 3, 4})); // false
        System.out.println(s.find132pattern(new int[]{3, 1, 4, 2})); // true
        System.out.println(s.find132pattern(new int[]{-1, 3, 2, 0})); // true
    }
}

class SolutionPattern132 {
    // o(n^2)
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) return false;
        boolean res = false;
        for (int i = 0; i < nums.length - 2 && !res; i ++) {
            int leftMax = 0;
            for (int j = i + 1; j < nums.length && !res; j ++) {
                int gap = nums[j] - nums[i];
                if (leftMax != 0 && gap > 0 && gap < leftMax) {
                    res = true;
                }
                if (gap > 0 && gap > leftMax) {
                    leftMax = gap;
                }
            }
        }
        return res;
    }
}