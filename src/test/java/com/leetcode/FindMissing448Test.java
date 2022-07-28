package com.leetcode;

import static org.assertj.core.api.Assertions.*;
import java.util.Arrays;
import org.junit.Test;
public class FindMissing448Test {

    @Test
    public void simpleCase() {

        FindMissing448 f = new FindMissing448();

        assertThat(
                f.findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }))
                .isEqualTo(Arrays.asList(5, 6));
    }

}
