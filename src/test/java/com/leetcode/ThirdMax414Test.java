package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class ThirdMax414Test {

    @Test
    public void simpleCase() {

        ThirdMax414 t = new ThirdMax414();

        assertThat(
                t.thirdMax(new int[] { 3, 2, 1 })).isEqualTo(1);
    }
    
    @Test
    public void simpleCase2() {

        ThirdMax414 t = new ThirdMax414();

        assertThat(
                t.thirdMax(new int[] { 1,2 })).isEqualTo(2);
    }


    @Test
    public void simpleCase3() {

        ThirdMax414 t = new ThirdMax414();

        assertThat(
                t.thirdMax(new int[] { 2,2,3,1 })).isEqualTo(1);
    }
}
