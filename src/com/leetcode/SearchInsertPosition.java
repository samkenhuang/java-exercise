package com.leetcode;

/**
 * Created by huangxin on 2017/6/19.
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        SolutionSearchInsertPosition s = new SolutionSearchInsertPosition();
        System.out.println(s.searchInsert(new int[]{1,3,4,5,6,9}, 7));
        System.out.println(s.searchInsert(new int[]{1}, 2));
    }
}

class SolutionSearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int res = 0;
        for (int i = 0; i < nums.length; i ++) {
            res = i;
            if (nums[i] >= target) break;
            res ++;
        }
        return res;
    }
}
