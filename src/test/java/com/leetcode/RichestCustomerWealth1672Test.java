package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class RichestCustomerWealth1672Test {
    @Test
    public void simpleCase1() {
        RichestCustomerWealth1672 r = new RichestCustomerWealth1672();
        assertThat(
                r.richest(new int[][] { { 1, 2, 3 }, { 2, 3, 4 } }))
                .isEqualTo(9);

        assertThat(
                r.richest(new int[][] { { 1, 5 }, { 7, 3 }, { 3, 5 } }))
                .isEqualTo(10);
    }

}
