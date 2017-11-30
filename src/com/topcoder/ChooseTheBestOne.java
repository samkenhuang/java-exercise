package com.topcoder;

import java.util.Vector;

/**
 * Created by huangxin on 2017/8/24.
 */
public class ChooseTheBestOne {
    public int countNumber(int N) {
        Vector v = new Vector();
        for (int i = 1; i <= N; i ++) {
            v.add(new Integer(i));
        }
        int last = 0;
        for (int i = 1; i < N; i ++) {
            int index = (i * i * i + last) % (N - i + 1);
            index = (index != 0 ? index : (N - i + 1)) - 1;
            v.remove(index);
            last = index;
        }
        return (Integer) v.get(0);
    }

    public static void main(String[] args) {
        ChooseTheBestOne s = new ChooseTheBestOne();
        System.out.println(s.countNumber(3)); // 2
        System.out.println(s.countNumber(6)); // 6
        System.out.println(s.countNumber(10)); // 8
        System.out.println(s.countNumber(1234)); // 341
    }
}
