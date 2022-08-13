package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();

        for (int i : nums) {
            if (hashSet.contains(i)) return true;
            hashSet.add(i);
        }
        return false;
    }
}
