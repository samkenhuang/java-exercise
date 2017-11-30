package com.leetcode;

/**
 * Created by huangxin on 2017/4/20.
 * https://leetcode.com/problems/trapping-rain-water/#/description
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        SolutionTrappingRainWater s = new SolutionTrappingRainWater();
        System.out.println(s.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1})); // 6
    }
}

class SolutionTrappingRainWater {
    public int trap(int[] height) {
        int res = 0;
        int left = 0, right = height.length - 1;
        if (right < 2) return res;
        int maxLeft = height[left], maxRight = height[right];
        while (left <= right) {
            if(maxLeft < maxRight) {
                if (height[left] > maxLeft) maxLeft = height[left];
                else res += maxLeft - height[left];
                left ++;
            } else {
                if (height[right] > maxRight) maxRight = height[right];
                else res += maxRight - height[right];
                right --;
            }
        }
        return res;
    }
}