package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashSet1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        for (int i : nums1) {
            hashSet1.add(i);
        }

        for (int j : nums2) {
            if (hashSet1.contains(j)) {
                resultSet.add(j);
            }
        }
        return resultSet.stream().mapToInt(Number::intValue).toArray();

    }
}
