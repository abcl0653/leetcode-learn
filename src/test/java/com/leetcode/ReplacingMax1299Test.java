package com.leetcode;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class ReplacingMax1299Test {

    @Test
    public void simpleCase() {
        ReplacingMax1299 r = new ReplacingMax1299();
        assertThat(
                r.replaceElements(new int[] { 17, 18, 5, 4, 6, 1 }))
                .isEqualTo(new int[] { 18, 6, 6, 6, 1, -1 });

        assertThat(r.replaceElements(new int[] {400})).isEqualTo(
            new int[] {-1}
        );
    }

}
