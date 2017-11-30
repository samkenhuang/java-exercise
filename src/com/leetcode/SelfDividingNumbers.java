package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangxin on 2017/11/28.
 */
public class SelfDividingNumbers {
    public static void main(String[] args) {
        SolutionSelfDividingNumbers s = new SolutionSelfDividingNumbers();
        System.out.println(s.selfDividingNumbers(1,22)); // 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22
    }
}

class SolutionSelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = left; i <= right; i ++) {
            if (isSelfDividingNumbers(i)) res.add(i);
        }
        return res;
    }

    private boolean isSelfDividingNumbers(int n) {
        boolean res = true;
        int currentNumber = n;
        while (currentNumber >= 1) {
            int mod = currentNumber % 10;
            if (mod == 0) return false;
            else if (n % mod != 0) return false;
            currentNumber = currentNumber / 10;
        }
        return res;
    }
}
