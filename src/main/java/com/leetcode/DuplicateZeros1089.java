package com.leetcode;

public class DuplicateZeros1089 {
    
    public void solve(int[] arr) {
        int N = arr.length;
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] == 0) {
                int j = N - 1;
                while (j > i + 1) {
                    arr[j] = arr[j-1];
                    j--;
                }
                arr[i+1] = 0;
                i++;
            }
        }
    }
}
