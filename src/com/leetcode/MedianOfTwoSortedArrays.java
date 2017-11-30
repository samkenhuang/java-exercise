package com.leetcode;

/**
 *
 */
class SolutionMedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length, i = 0, j = 0;
        int[] allArr = new int[2000];
        while(i < len1 || j < len2) {
            if(i == len1) {
                allArr[i + j] = nums2[j];
                j ++;
            } else if(j == len2) {
                allArr[i + j] = nums1[i];
                i ++;
            } else {
                if(nums1[i] > nums2[j]) {
                    allArr[i + j] = nums2[j];
                    j ++;
                }  else {
                    allArr[i + j] = nums1[i];
                    i ++;
                }
            }
        }
        double median = 0;
        if((len1 + len2) % 2 == 1) {
            median = (double)allArr[(len1 + len2 + 1) / 2 - 1];
        } else {
            median = (double)(allArr[(len1 +len2) / 2 - 1] + allArr[(len1 + len2) / 2]) / 2;
        }
        return median;
    }
}

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        SolutionMedianOfTwoSortedArrays s = new SolutionMedianOfTwoSortedArrays();
        double d = s.findMedianSortedArrays(nums1, nums2);
        System.out.println(d);
    }
}