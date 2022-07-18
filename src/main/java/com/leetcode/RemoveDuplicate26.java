package com.leetcode;

public class RemoveDuplicate26 {
    public int removeDuplicates(int[] nums) {

        int N = nums.length;
        int k = N;

        int i = 0;
        int j = 0;

        int current = nums[i];

        for (i = 1; i < k; i++) {

            while (j < N - 1) {
                j++;
                if (nums[j] == current) {
                    k--;
                } else {
                    nums[i] = nums[j];
                    current = nums[j];
                    break;
                }
            }
        }

        return k;
    }

}
