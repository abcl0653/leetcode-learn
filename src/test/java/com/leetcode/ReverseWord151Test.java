package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
public class ReverseWord151Test {

    @Test
    public void simpleCase() {
        ReverseWord151 r = new ReverseWord151();

        assertThat(r.reverseWords("the sky is blue")).isEqualTo("blue is sky the");
    }
    
    @Test
    public void simpleCase2() {
        ReverseWord151 r = new ReverseWord151();

        assertThat(r.reverseWords("a good   example")).isEqualTo("example good a");

        assertThat(r.reverseWords("  hello world  ")).isEqualTo("world hello");
    }
    
}
