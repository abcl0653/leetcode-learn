package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> e = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {

            if (e.isEmpty()) {
                e.add(1);
            } else {
                List<Integer> e2 = new ArrayList<>();
                e2.add(1);
                for (int j = 1; j < e.size(); j++) {
                    e2.add(e.get(j) + e.get(j - 1));
                }
                e2.add(1);

                e = e2;
            }

            result.add(e);
        }

        return result;
    }
}
