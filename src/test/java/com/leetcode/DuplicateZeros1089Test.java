package com.leetcode;
import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class DuplicateZeros1089Test {

    @Test
    public void simpleCase() {

        DuplicateZeros1089 d = new DuplicateZeros1089();

        int[] arr = new int[]{1,0,2,3,4};
        d.solve(arr);
        assertThat(arr)
            .isEqualTo(new int[]{1,0,0,2,3});
    }
}
