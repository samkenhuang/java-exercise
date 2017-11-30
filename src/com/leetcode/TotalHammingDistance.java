package com.leetcode;

/**
 * Created by huangxin on 2017/11/27.
 * https://leetcode.com/problems/total-hamming-distance/description/
 * 目前超时
 */
public class TotalHammingDistance {
    public static void main(String[] args) {
        SolutionTotalHammingDistance s = new SolutionTotalHammingDistance();
        System.out.println(s.totalHammingDistance(new int[] {4, 14, 2})); // 6
    }
}

class SolutionTotalHammingDistance {
    public int totalHammingDistance(int[] nums) {
       int res = 0, len = nums.length;
       boolean recur = true;
       while (recur) {
           boolean shouldRecur = false;
           int zeroNum = 0;
           for (int i = 0; i < nums.length; i ++) {
               if (nums[i] % 2 == 0) zeroNum += 1;
               nums[i] = nums[i] >> 1;
               shouldRecur = (shouldRecur || nums[i] != 0);
           }
           recur = shouldRecur;
           res += zeroNum * (len - zeroNum);
       }
       return res;
    }
}