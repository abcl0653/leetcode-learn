package com.leetcode;
// Given a binary array nums, return the maximum number of consecutive 1's in the array.

// Example 1:

// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
// Example 2:

// Input: nums = [1,0,1,1,0,1]
// Output: 2

// Constraints:


// 1 <= nums.length <= 105
// nums[i] is either 0 or 1.
public class MaxConsecurtive485 {
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxConsecutiveResult = 0;
        int maxConsecutive = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 && i < nums.length - 1) {
                maxConsecutive++;

            } else {
                if (nums[i] == 1) {
                    maxConsecutive++;
                }
                if (maxConsecutive > maxConsecutiveResult) {
                    maxConsecutiveResult = maxConsecutive;
                }
                maxConsecutive = 0;
            }
        }
        return maxConsecutiveResult;
    }
}

class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (( nums[i] <= 10000 && nums[i] > 1000) || (nums[i] <= 100 && nums[i] > 10) || nums[i] == 100000){
                result++;
            }
        }
        return result;
    }
}