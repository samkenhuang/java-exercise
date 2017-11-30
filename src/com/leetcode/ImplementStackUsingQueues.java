package com.leetcode;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by huangxin on 2017/4/20.
 */
public class ImplementStackUsingQueues {
    public static void main(String[] args) {
        SolutionImplementStackUsingQueues s = new SolutionImplementStackUsingQueues();
        s.push(1);
        s.push(2);
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.top());
    }
}

class SolutionImplementStackUsingQueues {
    /** Initialize your data structure here. */
    private Queue<Integer> queue;
    private Queue<Integer> tmpQueue;
    private  int len;
    public SolutionImplementStackUsingQueues() {
        queue = new LinkedBlockingQueue<Integer>();
        tmpQueue = new LinkedBlockingQueue<Integer>();
        len = 0;
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        len ++;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (len > 1) {
            tmpQueue.add(queue.poll());
            len --;
        }
        int res = queue.peek();
        queue.poll();
        len --;
        while (!tmpQueue.isEmpty()) {
            queue.add(tmpQueue.poll());
            len ++;
        }
        return res;
    }

    /** Get the top element. */
    public int top() {
        while (len > 1) {
            tmpQueue.add(queue.poll());
            len --;
        }
        int res = queue.peek();
        tmpQueue.add(queue.poll());
        len --;
        while (!tmpQueue.isEmpty()) {
            queue.add(tmpQueue.poll());
            len ++;
        }
        return res;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
