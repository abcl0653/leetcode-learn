package com.leetcode;

public class RemoveElements27 {
    public int removeElement(int[] nums, int val) {
        // return 1;
        int N = nums.length;

        int i = 0;
        int j = N - 1;
        int k = N;

        while (i <= j) {
            if (nums[i] == val) {
                k--;
                while (i < j) {
                    if (nums[j] == val) {
                        k--;
                    } else {
                        nums[i] = nums[j];
                        j--;
                        break;
                    }
                    j--;
                }
            }
            i++;
        }
        return k;
    }
}
