package com.leetcode;

/**
 * Created by huangxin on 2017/11/27.
 */
public class HammingDistance {
    public static void main(String[] args) {
        SolutionHammingDistance s = new SolutionHammingDistance();
        System.out.println(s.hammingDistance(1, 5));
        System.out.println(s.hammingDistance(1, 4));
    }
}

class SolutionHammingDistance {
    public int hammingDistance(int x, int y) {
        int res = 0;
        while (x > 0 || y > 0) {
            if (x % 2 != y % 2) {
                res ++;
            }
            x = x >> 1;
            y = y >> 1;
        }
        return res;
    }
}