package com.leetcode;

// import java.util.Arrays;

public class SquareOfSortedArray977 {

    // [-4,-1,0,3,10] --> [0,1,9,16,100]

    public int[] sortedSquares(int[] nums) {
        // int[] result = new int[nums.length];
        // Trivial solution - O(N^2)?
        // for (int i = 0; i < nums.length; i++) {
        // result[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(result);
        // return result;

        // O(N) Solution
        int N = nums.length;
        int[] result = new int[N];
        int i = 0;
        int left = 0;
        while (i < N && nums[i] < 0) {
            ++i;
        }
        left = i - 1;
        int right = i;
        i = 0;
        while (i < N) {
            if (  left>= 0 && (right >= N || nums[left] * nums[left] < nums[right] * nums[right]  )) {
                result[i] = nums[left] * nums[left];
                left--;
            } else {
                result[i] = nums[right] * nums[right];
                right++;
            }
            i++;
        }
        return result;
    }
}
