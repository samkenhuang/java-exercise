package com.leetcode;

/**
 * Created by huangxin on 2017/11/28.
 */
public class JudgeRouteCircle {
    public static void main(String[] args) {
        SolutionJudgeRouteCircle s = new SolutionJudgeRouteCircle();
        System.out.println(s.judgeCircle("UD"));
        System.out.println(s.judgeCircle("LL"));
    }
}

class SolutionJudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        boolean res = false;
        int vertical = 0, horizontal = 0;
        for (int i = 0; i < moves.length(); i ++) {
            switch (moves.charAt(i)) {
                case 'U':
                    horizontal += 1;
                    break;
                case 'D':
                    horizontal -= 1;
                    break;
                case 'L':
                    vertical -= 1;
                    break;
                case 'R':
                    vertical += 1;
                    break;
                default:

            }
        }
        if (vertical == 0 && horizontal == 0) res = true;
        return res;
    }
}