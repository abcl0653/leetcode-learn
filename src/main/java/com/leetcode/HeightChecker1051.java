package com.leetcode;

import java.util.Arrays;

public class HeightChecker1051 {
    public int heightChecker(int[] heights) {
        int[] original = Arrays.copyOf(heights, heights.length);
        int swap;
        int counter = 0;

        int j;
        for (int i = 0; i < heights.length; i++) {
            for (j = 0; j < original.length - 1 - i; j++) {
                if (heights[j] > heights[j+1]) {
                    //swap(j, j+1);
                    swap = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = swap;
                }
                
            }
            if (original[j] != heights[j]) {
                counter++;
            }
        }
        return counter;
    }

    
}
