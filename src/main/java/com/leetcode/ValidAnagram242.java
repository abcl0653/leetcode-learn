package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for (int i = 0; i < sArray.length; i++) {
            sMap.computeIfPresent(sArray[i], (k, v) -> v + 1);
            sMap.putIfAbsent(sArray[i], 1);

        }

        for (int i = 0; i < tArray.length; i++) {
            tMap.computeIfPresent(tArray[i], (k, v) -> v + 1);
            tMap.putIfAbsent(tArray[i], 1);
        }

        return sMap.equals(tMap);
    }
}
