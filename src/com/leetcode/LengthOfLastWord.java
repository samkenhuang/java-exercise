package com.leetcode;

/**
 * Created by huangxin on 2017/6/22.
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        SolutionLengthOfLastWord s = new SolutionLengthOfLastWord();
        System.out.println(s.lengthOfLastWord("Hello World"));
        System.out.println(s.lengthOfLastWord(" "));
    }
}

class SolutionLengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int res = 0;
        String[] substringArr = s.split(" ");
        if (substringArr.length > 0) {
            res = substringArr[substringArr.length - 1].length();
        }
        return res;
    }
}
