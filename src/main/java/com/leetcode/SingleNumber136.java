package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber136 {
    public int singleNumber(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();

        for (int i : nums) {
            if (hashSet.contains(i)) {
                hashSet.remove(i);
            } else {
                hashSet.add(i);
            }
        }

        Integer[] r = new Integer[0];
        r = hashSet.toArray(r);
        return r[0];

    }
}
