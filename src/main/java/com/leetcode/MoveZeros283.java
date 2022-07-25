package com.leetcode;

public class MoveZeros283 {
    public void moveZeroes(int[] nums) {
        int pointerB = 0;
        int pointerA = 0;
        while (pointerA < nums.length  && pointerB < nums.length) {
            while (nums[pointerB] == 0 && pointerB < nums.length - 1) {
                pointerB++;
            }
            nums[pointerA] = nums[pointerB];
            pointerA++;
            pointerB++;

        }
        while (pointerA < nums.length) {
            nums[pointerA++] = 0;

        }
    }
}
