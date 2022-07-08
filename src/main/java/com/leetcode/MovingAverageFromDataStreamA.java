package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MovingAverageFromDataStreamA {

    private int size = 0;
    private int count = 0;
    private int windowSum = 0;

    Deque<Integer> deque = new ArrayDeque<>();


    public MovingAverageFromDataStreamA(int size) {
        this.size = size;    
        
    }

    public Double next(Integer i) {

        count ++ ;
        
        Integer head = count > size ? deque.poll() : 0;
        deque.add(i);

        windowSum = windowSum - head + i;

        return windowSum * 1.0 / Math.min(size, count);
        


        
    }
}
