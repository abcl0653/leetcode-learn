package com.leetcode;

public class ReplacingMax1299 {
    public int[] replaceElements(int[] arr) {
        int currentMax = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        int tmp;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (currentMax < arr[i]) {
                tmp = arr[i];
                arr[i] = currentMax;
                currentMax = tmp;
            } else {
                arr[i] = currentMax;
            } 


        }
        return arr;

    }
}
