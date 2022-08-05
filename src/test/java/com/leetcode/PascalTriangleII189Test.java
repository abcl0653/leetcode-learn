package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.Test;

public class PascalTriangleII189Test {
    @Test
    public void simpleCase() {
        PascalTriangleII189 p = new PascalTriangleII189();

        assertThat(
                p.getRow(3)).isEqualTo(Arrays.asList(1, 3, 3, 1));

        assertThat(
                p.getRow(4)).isEqualTo(Arrays.asList(1, 4, 6, 4, 1));
    }

    @Test
    public void simpleCase2() {
        PascalTriangleII189 p = new PascalTriangleII189();

        assertThat(
            p.getRow(15)).isEqualTo(
                Arrays.asList(1,
                        15,
                        105,
                        455,
                        1365,
                        3003,
                        5005,
                        6435,
                        6435,
                        5005,
                        3003,
                        1365,
                        455,
                        105,
                        15,
                        1));

    }
}
