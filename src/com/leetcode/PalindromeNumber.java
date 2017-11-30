package com.leetcode;

/**
 * Created by huangxin on 2017/5/2.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        SolutionPalindromeNumber s = new SolutionPalindromeNumber();
        System.out.println(s.isPalindrome(1111));
        System.out.println(s.isPalindrome(12321));
        System.out.println(s.isPalindrome(1121));
    }

}

class SolutionPalindromeNumber {
    public boolean isPalindrome(int x) {
        boolean res = true;
        String s = String.valueOf(x);
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                res = false;
                break;
            }
            left ++;
            right --;
        }
        return res;
    }
}