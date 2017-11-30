package com.leetcode;

/**
 * Created by huangxin on 2017/5/18.
 * https://leetcode.com/problems/regular-expression-matching/#/description
 */
public class RegularExpressionMatching {
    public static void main(String[] args) {
        SolutionRegularExpressionMatching s = new SolutionRegularExpressionMatching();
        System.out.println(s.isMatch("aa","a")); // false
        System.out.println(s.isMatch("aa","aa")); // true
        System.out.println(s.isMatch("aaa","aa")); // false
        System.out.println(s.isMatch("aa", "a*")); // true
        System.out.println(s.isMatch("aa", ".*")); // true
        System.out.println(s.isMatch("ab", ".*")); // true
        System.out.println(s.isMatch("aab", "c*a*b"));// true
    }
}

class SolutionRegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        boolean res = true;

        return res;
    }
}
