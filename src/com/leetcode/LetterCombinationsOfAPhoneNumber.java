package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by huangxin on 2017/4/7.
 */
public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        SolutionLetterCombinationsOfAPhoneNumber s = new SolutionLetterCombinationsOfAPhoneNumber();
        s.letterCombinations("23");
    }
}


class SolutionLetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<String>();
        if (digits.length() == 0) return res;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        res.add("");
        for (int i = 0; i < digits.length(); i ++) {
            int x = Character.getNumericValue(digits.charAt(i));
            while (res.peek().length() == i) {
                String t = res.remove();
                for (char s : mapping[x].toCharArray())
                    res.add(t + s);
            }
        }
        return res;
    }
}