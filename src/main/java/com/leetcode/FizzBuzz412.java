package com.leetcode;

public class FizzBuzz412 {
    public String[] solve(int length) {
        // return new String[] {"1", "2", "Fizz"};
        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            if ((i + 1) % 15 == 0 ) { result[i] = "FizzBuzz" ; } 
            else if ((i + 1) % 3 == 0) { result[i] = "Fizz"; } 
            else if ((i + 1) % 5 ==0 ) { result[i] = "Buzz"; }
            else result[i] = String.valueOf(i + 1);
        }
        return result;
    }
}
