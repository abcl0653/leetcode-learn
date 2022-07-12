package com.leetcode;
import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class ReduceToZero1342Test {

    @Test
    public void simpleCase() {
        ReduceToZero1342 r = new ReduceToZero1342();
        assertThat(r.solve(14)).isEqualTo(6);

    }
}
