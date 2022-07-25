package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class MoveZeros283Test {
    @Test
    public void simpleCase() {
        MoveZeros283 m = new MoveZeros283();
        int[] a = new int[] { 0, 1, 0, 3, 12, 0 };
        m.moveZeroes(a);

        assertThat(a).isEqualTo(new int[] {1,3,12,0,0,0});
    }
    @Test
    public void simpleCase2() {
        MoveZeros283 m = new MoveZeros283();
        int[] a = new int[] {1,0};
        m.moveZeroes(a);

        assertThat(a).isEqualTo(new int[] {1,0});
    }


    @Test
    public void simpleCase3() {
        MoveZeros283 m = new MoveZeros283();
        int[] a = new int[] {0,0,1};
        m.moveZeroes(a);

        assertThat(a).isEqualTo(new int[] {1,0,0});
    }
}
