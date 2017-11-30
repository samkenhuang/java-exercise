package com.leetcode;

/**
 * Created by huangxin on 2017/6/19.
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        SolutionRemoveDuplicatesFromSortedArray s = new SolutionRemoveDuplicatesFromSortedArray();
        System.out.println(s.removeDuplicates(new int[]{1,2,3,3,4,4,5}));
    }
}

class SolutionRemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int length = 1;
        if (nums.length == 0 && nums.length == 1) return nums.length;
        for (int i = 1; i < nums.length; i ++) {
            if (nums[i] != nums[i - 1]) nums[length++] = nums[i];
        }
        return length;
    }
}