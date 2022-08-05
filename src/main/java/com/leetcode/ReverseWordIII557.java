package com.leetcode;


public class ReverseWordIII557 {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int i = 0;

        while ( i <= s.length()) {
            if ( i == chars.length || chars[i] == ' ') {
                reverse(chars, start, i - 1);
                start = ++i;
            }
            i++;
        }
        return String.valueOf(chars);
    }

    public void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start ++;
            end --;
        }
    }
}
