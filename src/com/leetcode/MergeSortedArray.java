package com.leetcode;

/**
 * Created by huangxin on 2017/6/27.
 * https://leetcode.com/problems/merge-sorted-array/#/description
 */
public class MergeSortedArray {
    public  static void main(String[] args) {
        SolutionMergeSortedArray s = new SolutionMergeSortedArray();
        int[] nums1 = new int[]{4,5,6,0,0,0};
        int[] nums2 = new int[]{1,2,3};
        s.merge(nums1, 3, nums2, 3);
    }
}

class SolutionMergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int current = 0, index1 = 0, index2 = 0;
        int[] res = new int[m + n];
        while (current < m + n) {
            if (index1 >= m){
                res[current] = nums2[index2++];
            } else if (index2 >= n) {
                res[current] = nums1[index1++];
            } else {
                if (nums1[index1] <= nums2[index2]) res[current] = nums1[index1++];
                else res[current] = nums2[index2++];
            }
            current ++;
        }
        for (int i = 0; i < n + m; i ++) {
            nums1[i] = res[i];
        }
    }
}