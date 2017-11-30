package com.leetcode;

import java.util.Stack;

/**
 * Created by huangxin on 2017/4/21.
 */
public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        SolutionImplementQueueUsingStacks s = new SolutionImplementQueueUsingStacks();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}

class SolutionImplementQueueUsingStacks {
    private Stack<Integer> stack;
    private Stack<Integer> tmpStack;
    /** Initialize your data structure here. */
    public SolutionImplementQueueUsingStacks() {
        stack = new Stack<Integer>();
        tmpStack = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!stack.empty()) {
            tmpStack.push(stack.pop());
        }
        int res = tmpStack.pop();
        while (!tmpStack.empty()) {
            stack.push(tmpStack.pop());
        }
        return res;
    }

    /** Get the front element. */
    public int peek() {
        while (!stack.empty()) {
            tmpStack.push(stack.pop());
        }
        int res = tmpStack.peek();
        while (!tmpStack.empty()) {
            stack.push(tmpStack.pop());
        }
        return res;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.empty();
    }
}