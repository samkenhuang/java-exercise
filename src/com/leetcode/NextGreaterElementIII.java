package com.leetcode;

/**
 * Created by huangxin on 2017/5/16.
 */
public class NextGreaterElementIII {
    public static void main(String[] args) {
        SolutionNextGreaterElementIII s = new SolutionNextGreaterElementIII();
        System.out.println(s.nextGreaterElement(12443322)); // 13222344
        System.out.println(s.nextGreaterElement(1999999999));
        System.out.println(s.nextGreaterElement(12));
        System.out.println(s.nextGreaterElement(21));
    }
}

class SolutionNextGreaterElementIII {
    public int nextGreaterElement(int n) {
        int res = -1;
        String s = String.valueOf(n);
        int changeX = -1, changeY = -1;
        boolean found = false;
        for (int i = s.length() - 2; i >= 0 && !found; i --) {
            for (int j = i + 1; j <= s.length() - 1; j ++) {
                if (s.charAt(j) > s.charAt(i)) {
                    changeX = i;
                    changeY = j;
                    found = true;
                }
            }
        }

        // 交换字符串
        if (changeX != -1) {
            char[] schar = s.toCharArray();
            char tmp = schar[changeX];
            schar[changeX] = schar[changeY];
            schar[changeY] = tmp;
            for (int i = changeX + 1; i < s.length(); i ++) {
                for (int j = i + 1; j < s.length(); j ++) {
                    if (schar[i] > schar[j]) {
                        tmp = schar[i];
                        schar[i] = schar[j];
                        schar[j] = tmp;
                    }
                }
            }
            try {
                res = Integer.parseInt(String.valueOf(schar));
            } catch (NumberFormatException e) {

            }
        }
        return res;
    }
}
