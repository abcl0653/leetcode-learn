package com.leetcode;


public class ReverseWord151 {
    
    public String reverseWords(String s) {
        s = "a "+s+" a";
        String[] split = s.split(" +");
        int start = 1; 
        int end = split.length - 2;
        while (start < end) {
            String temp = split[start];
            split[start] = split[end];
            split[end] = temp;
            start ++;
            end --;
        }
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 1; i < split.length - 1; i++) {
            if (!strBuilder.isEmpty()) strBuilder.append(" ");
            strBuilder.append(split[i]);
        }
        return strBuilder.toString();


        // char[] chars = s.toCharArray();

        // reverse(chars, 0, chars.length - 1);
        // int start = 0;
        // int i = 0;

        // while ( i <= s.length()) {
        //     if ( i == chars.length || chars[i] == ' ') {
        //         reverse(chars, start, i - 1);
        //         start = ++i;
        //     }
        //     i++;
        // }
        // return String.valueOf(chars);
    }

    // public void reverse(char[] chars, int start, int end) {
    //     while (start < end) {
    //         char temp = chars[start];
    //         chars[start] = chars[end];
    //         chars[end] = temp;
    //         start ++;
    //         end --;
    //     }
    // }
}
