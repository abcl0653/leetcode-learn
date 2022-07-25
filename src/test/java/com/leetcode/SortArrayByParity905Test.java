package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class SortArrayByParity905Test {

    @Test
    public void simpleCase() {

        SortArrayByParity905 s = new SortArrayByParity905();
        assertThat(s.sortArrayByParity(new int[] {3,1,2,4}))
            .isEqualTo(new int[] {2,4,3,1});
    }
    @Test
    public void simpleCase2() {

        SortArrayByParity905 s = new SortArrayByParity905();
        assertThat(s.sortArrayByParity(new int[] {0}))
            .isEqualTo(new int[] {0});
    }
}
