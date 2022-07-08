package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given a stream of integers and a window size k. We need to calculate the moving average of all the integers in the sliding window. 
 * If the number of elements in the stream is less than k, take all the elements.
 * 
 * We need to implement the Moving Average class:
 * MovingAverage(int size): Initializes the size of the window as size.
 * double next(int val): Returns the moving average of the last size values of the stream
 */
public class MovingAverageFromDataStream346 {

    int size;
    int windowSum;
    int count;

    Deque<Integer> queue = new ArrayDeque<Integer>();

    public MovingAverageFromDataStream346(int size) {
        this.size = size;
    }


    public Double next(int val) {
        
        ++count;

        int head = count > size ? queue.poll() : 0;

        queue.add(val);
        windowSum = windowSum - head + val;

        return windowSum * 1.0 / Math.min(size, count);
    }


}
