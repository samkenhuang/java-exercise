package com.leetcode;

/**
 * Created by huangxin on 2017/6/22.
 * https://leetcode.com/problems/sqrtx/#/description
 */
public class Sqrtx {
    public static void main(String[] args) {
        SolutionSqrtx s = new SolutionSqrtx();
        System.out.println(s.mySqrt(9));
        System.out.println(s.mySqrt(256));
        System.out.println(s.mySqrt(4));
    }
}

class SolutionSqrtx {
    public int mySqrt(int x) {
//        if (x == 0) return 0;
//        int res = 1, guess = x;
//        while (res != guess) {
//            res = (int) Math.floor((res + guess) / 2);
//            guess = (int) Math.floor(x / res);
//        }
//        return res;
        double res = Math.sqrt(x);
        return (int)res;
    }
}
