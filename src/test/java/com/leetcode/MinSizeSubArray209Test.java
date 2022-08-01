package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class MinSizeSubArray209Test {

    @Test
    public void simpleCase() {
        MinSizeSubArray209 m = new MinSizeSubArray209();

        assertThat(
            m.minSubArrayLen(7, new int[] { 2, 3, 1, 2, 4, 3 })).isEqualTo(2);
    }


    @Test
    public void simpleCase2() {
        MinSizeSubArray209 m = new MinSizeSubArray209();

        assertThat(
            m.minSubArrayLen(4, new int[] {1,4,4 })).isEqualTo(1);
    }

}
