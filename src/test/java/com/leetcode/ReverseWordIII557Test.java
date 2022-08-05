package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class ReverseWordIII557Test {

    @Test
    public void simpleCase() {
        ReverseWordIII557 r = new ReverseWordIII557();
        assertThat(
            r.reverseWords("This is good")).isEqualTo("sihT si doog");
    }

}
