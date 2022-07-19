package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class CheckDouble1346Test {

    @Test
    public void simpleCase() {
        CheckDouble1346 c = new CheckDouble1346();

        assertThat(c.checkIfExist(new int[]{10,2,5,3})).isTrue();
        assertThat(c.checkIfExist(new int[]{7,1,14,11})).isTrue();
        assertThat(c.checkIfExist(new int[]{3,1,7,11})).isFalse();
    }

}
