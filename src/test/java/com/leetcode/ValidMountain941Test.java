package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class ValidMountain941Test {

    @Test
    public void simpleCase() {

        ValidMoutain941 v = new ValidMoutain941();

        assertThat(v.validMountainArray(new int[]{1,2,3,4,5,4,1})).isTrue();
        assertThat(v.validMountainArray(new int[]{1,1})).isFalse();
        assertThat(v.validMountainArray(new int[]{0})).isFalse();
        assertThat(v.validMountainArray(new int[]{2,1})).isFalse();
        assertThat(v.validMountainArray(new int[]{1,2})).isFalse();
    }

}
