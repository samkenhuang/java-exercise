package com.leetcode;

import java.util.Stack;

/**
 * Created by huangxin on 2017/4/20.
 * https://leetcode.com/problems/min-stack/#/description
 */
public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        minStack.push(minStack.isEmpty() || x < minStack.peek() ? x : minStack.peek());
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

