package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by huangxin on 2017/4/21.
 */
public class NextGreaterElementI {
    public static void main(String[] args) {
        SolutionNextGreaterElementI s = new SolutionNextGreaterElementI();
        println(s.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2})); // -1 3 -1
        println(s.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4}));  // 3 -1
    }

    public static void println(int[] arr) {
        for (int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class SolutionNextGreaterElementI {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] res = new int[findNums.length];
        for (int i = 0; i < findNums.length; i ++) {
            int each = -1;
            int pos = 0;
            for (int k = 0; k < nums.length; k ++) {
                if (nums[k] == findNums[i]) {
                    pos = k; break;
                }
            }
            for (int k = pos + 1; k < nums.length; k ++) {
                if (nums[k] > findNums[i]) {
                    each = nums[k]; break;
                }
            }
            res[i] = each;
        }
        return res;
    }
}