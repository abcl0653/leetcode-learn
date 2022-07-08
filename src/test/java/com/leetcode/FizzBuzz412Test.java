package com.leetcode;
import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class FizzBuzz412Test {
    @Test
    public void simpleCase() {

        FizzBuzz412 fb = new FizzBuzz412();

        assertThat(fb.solve(3)).isEqualTo(new String[] {"1","2","Fizz"});
        assertThat(fb.solve(3)).isEqualTo(new String[] {"1","2","Fizz"});
        assertThat(fb.solve(3)).isEqualTo(new String[] {"1","2","Fizz"});
    }
}
