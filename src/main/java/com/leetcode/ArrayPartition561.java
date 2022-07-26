package com.leetcode;

import java.util.Arrays;

public class ArrayPartition561 {
    public int arrayPairSum(int[] nums) {
        int swap;
        int j = 0;
        int result = 0;
        // for (int i = 0; i < nums.length; i++) {
        // for (j = 0; j < nums.length - 1 - i; j++) {
        // if (nums[j] > nums[j+1]) {
        // //swap(j, j+1);
        // swap = nums[j];
        // nums[j] = nums[j+1];
        // nums[j+1] = swap;
        // }
        // }
        // if (i % 2 == 1) {
        // result += nums[j];
        // }
        // }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i = i + 2) {

            result += nums[i];

        }
        return result;
    }
}
