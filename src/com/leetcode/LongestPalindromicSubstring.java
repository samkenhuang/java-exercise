package com.leetcode;

/**
 * Created by huangxin on 2017/3/29.
 */
class SolutionLongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        int i = 0;
        String odd = "";
        for (; i < s.length(); i ++) {
            odd += "#" + s.charAt(i);
        }
        odd += "#";
        int[] p = new int[odd.length()];
        for (i = 0; i < odd.length(); i ++) {
            p[i] = 1;
        }
        int maxRight = 0, center = 0;
        int max = 1;
        String maxStr = "#";
        for (i = 0; i < odd.length(); i ++) {
            int j = i + 1;
            if (j < maxRight) {
                p[i] = p[2 * center - i];
                j = i + (p[i] + 1) / 2;
            }
            while (j < odd.length() && j <= 2 * i) {
                if (odd.charAt(j) == odd.charAt(2 * i - j)) {
                    p[i] += 2;
                    if (maxRight < j) {
                        maxRight = j;
                        center = i;
                    }
                    j ++;
                } else {
                    break;
                }
            }
            if (max < p[i]) {
                max = p[i];
                maxStr = odd.substring(i - (p[i] - 1) / 2, i + (p[i] + 1) / 2);
            }
        }
        String res = "";
        for (i = 0; i < maxStr.length(); i ++) {
            if (i % 2 != 0) res += maxStr.charAt(i);
        }
        return res;
    }
}

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        SolutionLongestPalindromicSubstring s = new SolutionLongestPalindromicSubstring();
        System.out.println(s.longestPalindrome("aaaa"));
        System.out.println(s.longestPalindrome("babad"));
        System.out.println(s.longestPalindrome("cbbd"));
    }
}
