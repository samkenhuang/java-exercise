package com.leetcode;

class SolutionLengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len <= 1) return len;

        int max = 0, i = 0;
        String str = "";
        while(i < len) {
            char c = s.charAt(i);
            int index = str.indexOf(c);
            str += c;
            if(index == -1) {
                max = (max > str.length()) ? max : str.length();
            } else {
                str = str.substring(index + 1);
            }
            i ++;
        }
        return max;
    }
}
public class LengthOfLongestSubstring {
    public static void main(String[] arg) {
        SolutionLengthOfLongestSubstring s = new SolutionLengthOfLongestSubstring();
        int i = s.lengthOfLongestSubstring("aab");
        System.out.println(i);
    }
}