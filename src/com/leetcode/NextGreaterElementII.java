package com.leetcode;

/**
 * Created by huangxin on 2017/5/16.
 */
public class NextGreaterElementII {
    public static void main(String[] args) {
        SolutionNextGreaterElementII s = new SolutionNextGreaterElementII();
        System.out.println(s.nextGreaterElements(new int[]{1,8,-1,-100,-1,222,1111111,-111111}));
        System.out.println(s.nextGreaterElements(new int[]{1, 2, 3, 4, 3}));
        System.out.println(s.nextGreaterElements(new int[]{1, 2, 1})); // 2, -1, 2
    }
}

class SolutionNextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i ++) {
            int nextGreater = -1;
            for (int j = 1; j <= nums.length; j ++) {
                int index = ((i + j) >= nums.length) ? (i + j - nums.length) : (i + j);
                if (nums[index] > nums[i]) {
                    nextGreater = nums[index];
                    break;
                }
            }
            res[i] = nextGreater;
        }
        return res;
    }
}
