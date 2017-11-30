package com.leetcode;

/**
 * Created by huangxin on 2017/11/28.
 */
public class FriendCircles {
    public static void main(String[] args) {
        SolutionFriendCircles s = new SolutionFriendCircles();
        System.out.println(s.findCircleNum(new int[][] {{1,1,0}, {1,1,0},{0,0,1}})); // 2
        System.out.println(s.findCircleNum(new int[][] {{1,1,0}, {1,1,1},{0,1,1}})); // 1
    }
}

class SolutionFriendCircles {
    public int findCircleNum(int[][] M) {
        int res = 0;
        return res;
    }
}