package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindMissing448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] organized = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            organized[nums[i]-1] = 1;
        }
        for (int i = 0; i < organized.length; i++) {
            if (organized[i] != 1) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
