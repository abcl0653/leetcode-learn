package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RansomNote383 {
    public boolean solve(String ransomNote, String magazine) {

        Map<Character, Integer> counts = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (char r : ransomNote.toCharArray()) {
            if (!counts.containsKey(r) || counts.get(r) == 0) {
                return false;
            } else {
                counts.put(r, counts.get(r) - 1);
            }
        }

        return true;

    }

}
