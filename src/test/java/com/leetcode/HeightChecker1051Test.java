package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class HeightChecker1051Test {

    @Test
    public void simpleCase() {
        HeightChecker1051 h = new HeightChecker1051();
        assertThat(
                h.heightChecker(new int[] { 1, 1, 4, 2, 1, 3 })).isEqualTo(3);
    }

    @Test
    public void simpleCase2() {
        HeightChecker1051 h = new HeightChecker1051();
        assertThat(
                h.heightChecker(new int[] { 5, 1, 2, 3, 4 })).isEqualTo(5);
    }


    @Test
    public void simpleCase3() {
        HeightChecker1051 h = new HeightChecker1051();
        assertThat(
                h.heightChecker(new int[] { 1, 2, 3, 4, 5 })).isEqualTo(0);
    }

}
