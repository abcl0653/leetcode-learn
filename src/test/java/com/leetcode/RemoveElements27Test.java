package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class RemoveElements27Test {
    @Test
    public void simpleCase() {
        RemoveElements27 r = new RemoveElements27();
        int[] nums = new int[] { 3, 2, 2, 3 };
        int k = r.removeElement(nums, 3);
        assertThat(k).isEqualTo(2);

        for (int i = 0; i < 2; i++) {
            assertThat(nums[i]).isEqualTo(2);
        }
    }

    @Test
    public void simpleCase2() {
        RemoveElements27 r = new RemoveElements27();
        int[] nums = new int[] { 1 };
        int k = r.removeElement(nums, 1);
        assertThat(k).isZero();

    }
}
