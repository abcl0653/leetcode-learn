package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class ValidAnagram242Test {

    @Test
    public void simpleCase() {
        ValidAnagram242 v = new ValidAnagram242();

        assertThat(
                v.isAnagram("anagram", "nagaram")).isTrue();
        assertThat(
                v.isAnagram("rat", "cat")).isFalse();
    }

}
