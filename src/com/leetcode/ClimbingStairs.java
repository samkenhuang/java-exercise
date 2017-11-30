package com.leetcode;

/**
 * Created by huangxin on 2017/6/27.
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        SolutionClimbingStairs s = new SolutionClimbingStairs();
        System.out.println(s.climbStairs(3)); // 3
        System.out.println(s.climbStairs(4)); // 5
        System.out.println(s.climbStairs(44));
    }
}

class SolutionClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int last1 = 2, last2 = 1;
        for (int i = 3; i <= n; i ++) {
            last1 = last2 + last1;
            last2 = last1 - last2;
        }
        return last1;
    }
}