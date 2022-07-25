package com.leetcode;

public class SortArrayByParity905 {
    public int[] sortArrayByParity(int[] nums) {
        int swap;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 == 0) {
                        swap = nums[i];
                        nums[i] = nums[j];
                        nums[j] = swap;
                        break;
                    }
                }
            }
        }
        return nums;
    }

}
