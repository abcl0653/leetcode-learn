package com.leetcode;

public class ValidMoutain941 {
    public boolean validMountainArray(int[] arr) {

        boolean direction = true; // true: Up, false: Down
        for (int i = 0; i < arr.length - 1; i++) {

            if (direction) {
                if (i > 0 && arr[i + 1] < arr[i])
                    direction = false;
                else if (i == 0 && arr[i + 1] < arr[i])
                    return false;
                else if (arr[i + 1] == arr[i])
                    return false;
            } else {
                if (arr[i + 1] >= arr[i]) {
                    return false;
                }
            }
        }
        if (direction) {
            return false;
        }
        return true;
    }

}