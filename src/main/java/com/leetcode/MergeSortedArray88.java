package com.leetcode;


public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = nums1.length;
        if (m == 0) {
            for (int j = 0; j < nums2.length; j++) {
                nums1[j] = nums2[j];
            }
        }
        while (i >= 0) {

            if (m - 1 >= 0 && n - 1 >= 0 && nums1[m - 1] >= nums2[n - 1]) {
                nums1[i - 1] = nums1[m - 1];
                m--;
            } else if (n - 1 >= 0) {
                nums1[i - 1] = nums2[n - 1];
                n--;
            }
            i--;
        }
    }
}
