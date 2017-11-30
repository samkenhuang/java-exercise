package com.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by huangxin on 2017/4/6.
 */
public class Heaters {
    public static void main(String[] args) {
        SolutionHeaters s = new SolutionHeaters();
        System.out.println(s.findRadius(new int[]{1,2,3,4,5,6,7,8,9,10,17}, new int[]{2,7}));
        System.out.println(s.findRadius(new int[]{1,5}, new int[]{10}));
        System.out.println(s.findRadius(new int[]{1,2,3,5,15}, new int[]{2, 30}));
        System.out.println(s.findRadius(new int[]{282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923}, new int[]{823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612}));
    }
}

class SolutionHeaters {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        if(heaters.length == 1) {
            return Math.max(Math.abs(houses[houses.length - 1] - heaters[0]), Math.abs(houses[0] - heaters[0]));
        }
        int res = 0, i = 0, j = 0;
        while (i < houses.length) {
            int radius = 0;
            if (heaters[j] > houses[i]) {
                if(j > 0) {
                    radius = Math.min(Math.abs(heaters[j] - houses[i]), Math.abs(heaters[j - 1] - houses[i]));
                } else {
                    radius = heaters[j] - houses[i];
                }
            } else if(heaters[j] < houses[i]) {
                while (heaters[j] <= houses[i] && j < heaters.length - 1) {
                    j ++;
                }
                radius = Math.min(Math.abs(heaters[j] - houses[i]), Math.abs(heaters[j - 1] - houses[i]));
            }
            if (radius > res) res = radius;
            i ++;
        }
        return res;
    }
}