package com.leetcode.contest60;

import java.util.Stack;

/**
 * Created by huangxin on 2017/11/26.
 */
public class AsteroidCollision {
    public static void main(String[] args) {
        SolutionAsteroidCollision s = new SolutionAsteroidCollision();
        System.out.println(s.asteroidCollision(new int[] {-2, -2, 1, -2}));
        System.out.println(s.asteroidCollision(new int[] {-2, -2, -2, -1}));
        System.out.println(s.asteroidCollision(new int[] {-2, -2, -2, -2}));
        System.out.println(s.asteroidCollision(new int[] {5, 10, -5})); // {5, 10}
        System.out.println(s.asteroidCollision(new int[] {8, -8})); // {}
        System.out.println(s.asteroidCollision(new int[] {10, 2, -5})); // {10}
    }
}

class SolutionAsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<Integer>();
        for (int i = asteroids.length - 1; i >= 0; i --) {
            if (s.size() == 0) s.push(asteroids[i]);
            else {
                while (s.size() > 0) {
                    if (s.peek() < asteroids[i] && Math.abs(s.peek()) < Math.abs(asteroids[i])) {
                        s.pop();
                    } else {
                        break;
                    }
                }
                if (s.size() > 0) {
                    int peek = s.peek();
                    if (Math.abs(peek) > Math.abs(asteroids[i]) && peek >= asteroids[i]) {
                        s.push(asteroids[i]);
                    } else if (Math.abs(peek) == Math.abs(asteroids[i]) && peek != asteroids[i]) {
                        s.pop();
                    }
                } else {
                    s.push(asteroids[i]);
                }
            }
        }
        int[] res = new int[s.size()];
        int i = 0;
        while (s.size() > 0) {
            res[i ++] = s.pop();
        }
        return res;
    }
}
