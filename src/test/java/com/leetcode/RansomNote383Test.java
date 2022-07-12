package com.leetcode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RansomNote383Test {

    @Test
    public void simpleCase() {

        RansomNote383 r = new RansomNote383();

        assertThat(
                r.solve("a", "b")).isFalse();

        assertThat(
                r.solve("aa", "ab")).isFalse();

        assertThat(
                r.solve("aa", "aab")).isTrue();
    }
}
