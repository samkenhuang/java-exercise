package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by huangxin on 2017/4/20.
 * https://leetcode.com/problems/valid-parentheses/#/description
 */
public class ValidParentheses {
    public static void main(String[] args) {
        SolutionValidParentheses s = new SolutionValidParentheses();
        System.out.println(s.isValid("()"));
        System.out.println(s.isValid("()[]{}"));
        System.out.println(s.isValid("([)]"));
    }
}

class SolutionValidParentheses {
    public boolean isValid(String s) {
        boolean res = false;
        Stack<String> stack = new Stack<String>();
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("(", ")");
        map.put("[", "]");
        map.put("{", "}");
        for (int i = 0; i < s.length(); i ++) {
            String currentChar = String.valueOf(s.charAt(i));
            if (stack.isEmpty() || !currentChar.equals(map.get(stack.peek()))) {
                stack.push(currentChar);
            } else {
                stack.pop();
            }
        }
        res = stack.isEmpty() ? true : false;
        return res;
    }
}