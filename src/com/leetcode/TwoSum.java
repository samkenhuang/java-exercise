package com.leetcode;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        DONE: for(int i = 0; i < nums.length; i ++) {
            for(int j = i + 1; j < nums.length; j ++) {
                System.out.println("" + nums[i] + nums[j]);
                if(nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    break DONE ;
                }
            }
        }
        return res;
    }
}