package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class IntersectionTwoArrays349Test {

    @Test
    public void simpleCase() {

        IntersectionTwoArrays349 i = new IntersectionTwoArrays349();
        assertThat(
            i.intersection(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 })).isEqualTo(new int[] { 2 });
    }
}
