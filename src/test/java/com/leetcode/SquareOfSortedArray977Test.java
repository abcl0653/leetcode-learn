package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class SquareOfSortedArray977Test {

    @Test
    public void simpleCase() {
        SquareOfSortedArray977 s = new SquareOfSortedArray977();
        assertThat(s.sortedSquares(new int[]{-4,-1,0,3,10})).isEqualTo(new int[]{0,1,9,16,100});
    }

    @Test
    public void simpleCase2() {
        SquareOfSortedArray977 s = new SquareOfSortedArray977();
        assertThat(s.sortedSquares(new int[]{-12,-4,-1,0,3,10})).isEqualTo(new int[]{0,1,9,16,100,144});
    }

    @Test
    public void simpleCase3() {
        SquareOfSortedArray977 s = new SquareOfSortedArray977();
        assertThat(s.sortedSquares(new int[]{-1})).isEqualTo(new int[]{1});
    }


    @Test
    public void simpleCase4() {
        SquareOfSortedArray977 s = new SquareOfSortedArray977();
        assertThat(s.sortedSquares(new int[]{1})).isEqualTo(new int[]{1});
    }
}
