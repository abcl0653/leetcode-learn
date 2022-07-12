package com.leetcode;

public class ReduceToZero1342 {
    public int solve(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else
                num--;
            steps++;
        }
        return steps;
    }

}
