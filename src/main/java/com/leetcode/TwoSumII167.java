package com.leetcode;

public class TwoSumII167 {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length -1 ; i++) {

            // Search for target - numbers[i]
            int a = target - numbers[i];
            int result = binSearch(numbers, i+1, numbers.length - 1, a);
            if (result < 30001) {
                return new int[] {i+1,result+1};
            }
            
            
            // O(N) = ?
            // for (int j = i + 1; j < numbers.length; j++) {
            //     if (numbers[i] + numbers[j] == target) {
            //         return new int[] {i+1, j+1};
            //     }
            // }
        }    
        return new int[] {};
    }

    public int binSearch(int[] numbers, int begin, int end, int a) {
        if (a == numbers[begin]) return begin ;
        else if (a == numbers[end]) return end ;
        else if (end - begin < 2) return 30001;
        else if (a > numbers[begin]) {
            int middle = (begin + end) /2 ;
            if (a >= numbers[middle] ) {
                return binSearch(numbers, middle, end, a);
            } else {
                return binSearch(numbers, begin, middle, a);
            }
        } else  return 30001; 
    }
}
