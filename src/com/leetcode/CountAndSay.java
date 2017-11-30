package com.leetcode;

/**
 * Created by huangxin on 2017/6/19.
 * https://leetcode.com/problems/count-and-say
 */
public class CountAndSay {
    public static void main(String[] args){
        SolutionCountAndSay s = new SolutionCountAndSay();
        System.out.println(s.countAndSay(1)); // 1
        System.out.println(s.countAndSay(2)); // 11
        System.out.println(s.countAndSay(3)); // 21
        System.out.println(s.countAndSay(4)); // 1211
        System.out.println(s.countAndSay(5)); // 111221
        System.out.println(s.countAndSay(8));
    }
}

class SolutionCountAndSay {
    public String countAndSay(int n) {
        int res = 1;
        return "1";
    }
}