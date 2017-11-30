package com.leetcode;

/**
 * Created by huangxin on 2017/11/28.
 */
public class PerfectNumber {
    public static void main(String[] args) {
        SolutionPerfectNumber s = new SolutionPerfectNumber();
        System.out.println(s.checkPerfectNumber(28));
        System.out.println(s.checkPerfectNumber(6));
        System.out.println(s.checkPerfectNumber(33550336));
    }
}

class SolutionPerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        boolean res = false;
        int count = 1;
        for (int i = 2; i <= Math.sqrt(num); i ++) {
            if (num % i == 0) {
                count += i;
                if (i != num / i) count += num / i;
            }
        }
        if (count == num) res = true;
        return res;
    }
}
