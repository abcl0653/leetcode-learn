package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class ContainsDuplicate217Test {

    @Test
    public void simpleCase() {
        ContainsDuplicate217 c = new ContainsDuplicate217();

        assertThat(c.containsDuplicate(new int[] {1,2,2,3,1})).isTrue();
        assertThat(c.containsDuplicate(new int[] {1,2,3})).isFalse();
        assertThat(c.containsDuplicate(new int[] {1,2,3,1})).isTrue();
        assertThat(c.containsDuplicate(new int[] {1,2,2,3})).isTrue();
    }

}
