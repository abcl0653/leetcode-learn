package com.leetcode;

public class ThirdMax414 {
    public int thirdMax(int[] nums) {
        int swap;
        int j = 0;
        int counter = 0;
        int result = 2^31;
        // int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = swap;
                }
            }
            if (result != nums[j]) {
                counter++;
            }
            result = nums[j];
            if (counter == 3) {
                break;
            }
        }
        if (counter == 3)
            return result;
        return nums[nums.length - 1];
    }
}
