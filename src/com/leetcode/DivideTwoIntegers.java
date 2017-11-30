package com.leetcode;

import java.util.Map;

/**
 * Created by huangxin on 2017/4/5.
 */
public class DivideTwoIntegers {
    public static void main(String[] args) {
        SolutionDivideTwoIntegers s = new SolutionDivideTwoIntegers();
        System.out.println(s.divide(-1, 1));
    }
}

class SolutionDivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return dividend >= 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        if (dividend == 0) {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean is_negative = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);
        int res = 0;
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        while (a >= b) {
            int shift = 0;
            while (a >= (b << shift)) {
                shift ++;
            }
            a -= b << (shift - 1);
            res += 1 << (shift - 1);
        }
        return is_negative ? -res : res;
    }
}
