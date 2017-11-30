package com.leetcode;

/**
 * Created by huangxin on 2017/6/22.
 * https://leetcode.com/problems/maximum-subarray/#/description
 * 算法还不够精简
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        SolutionMaximumSubarray s = new SolutionMaximumSubarray();
        System.out.println(s.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})); // 6
    }
}

class SolutionMaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        if (nums.length == 1) return max;
        if (nums.length == 0) return 0;
        for (int i = 0; i < nums.length; i ++) {
            int res = nums[i];
            if (max < res) max = res;
            boolean loop = true;
            if (res <= 0) loop = false;
            for (int j = i + 1; j < nums.length && loop; j ++) {
                res += nums[j];
                if (max < res) max = res;
                if ((j + 1) < nums.length && nums[j + 1] > 0 && res <= 0) {
                    i = j;
                    loop = false;
                }
            }
        }
        return max;
    }
}