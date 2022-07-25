package com.dynamic;

import java.util.HashMap;
import java.util.Map;

/*
 * Dynamic Programming - Learn to Solve Algorithmic Problems & Coding Challenges
 * https://www.youtube.com/watch?v=oBt53YbR9Kk
 */
public class Fib {

    public Long fib(Long num, Map<Long, Long> memo ) {
        if (memo == null) {
            memo = new HashMap<>();
        }
        if (memo.keySet().contains(num)) return memo.get(num);
        if (num <= 2)  return 1L;
        memo.put(num, fib(num - 1, memo) + fib(num - 2,memo));
        return memo.get(num);
    }
}
