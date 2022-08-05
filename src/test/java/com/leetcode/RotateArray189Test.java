package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class RotateArray189Test {
    @Test
    public void simpleCase() {
        RotateArray189 r = new RotateArray189();

        int[] nums = new int[] {1,2,3,4,5,6,7};
        r.rotate(nums, 3);
        assertThat(nums).isEqualTo(new int[] {5,6,7,1,2,3,4});
    }
    @Test
    public void simpleCase2() {
        RotateArray189 r = new RotateArray189();

        int[] nums = new int[] {-1,-100,3,99};
        r.rotate(nums, 2);
        assertThat(nums).isEqualTo(new int[] {3,99,-1,-100});
    }
}
