package com.leetcode;

public class RichestCustomerWealth1672 {

    public int richest(int[][] grid) {
        int maxi = 0;
        for (int i = 0; i < grid.length; i++) {
            int maxj = 0;
            for (int j = 0; j < grid[i].length; j++) {
                maxj = maxj + grid[i][j];
            }
            if (maxj > maxi) maxi = maxj;
        }
        return maxi;
    }
}