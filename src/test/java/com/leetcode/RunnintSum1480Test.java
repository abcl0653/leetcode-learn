package com.leetcode;
import static org.assertj.core.api.Assertions.*;

import javax.naming.InitialContext;

import org.junit.Test;

public class RunnintSum1480Test {
    @Test
    public void simpleCase() {
        RunningSum1480 rs = new RunningSum1480();
        assertThat(rs.runningSum(new int[]{1,2,3,4})).isEqualTo(new int[]{1,3,6,10});
        assertThat(rs.runningSum(new int[]{1,1,1,1,1})).isEqualTo(new int[]{1,2,3,4,5});
    }
}
