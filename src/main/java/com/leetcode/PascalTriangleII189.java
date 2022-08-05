package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleII189 {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return Arrays.asList(1);
        } else {
            List<Integer> result = new ArrayList<>(rowIndex);
            // result.set(0, 1);
            result.add(1);
            List<Integer> l = getRow(rowIndex-1);
            for (int i = 1; i < rowIndex; i++) {
                // result.set(i, l.get(i - 1) + l.get(i));
                result.add(l.get(i - 1) + l.get(i));
            }
            result.add(1);
            return result;
        }  
    }
}
