package com.leetcode;

/**
 * Created by huangxin on 2017/6/19.
 */
public class RemoveElement {
    public static void main(String[] args) {
        SolutionRemoveElement s = new SolutionRemoveElement();
        System.out.println(s.removeElement(new int[]{3,2,2,3}, 3));
    }
}

class SolutionRemoveElement {
    public int removeElement(int[] nums, int val) {
        int res = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != val) nums[res++] = nums[i];
        }
        return res;
    }
}
