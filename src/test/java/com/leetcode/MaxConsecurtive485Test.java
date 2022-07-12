package com.leetcode;
import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class MaxConsecurtive485Test {
    @Test
    public void simpleCase() {
        MaxConsecurtive485 m = new MaxConsecurtive485();
        
        assertThat(m.findMaxConsecutiveOnes(new int[]{1,0,1,1,1,0,1})).isEqualTo(3);
        assertThat(m.findMaxConsecutiveOnes(new int[]{1,0,1,1,1,0,1,1,1,1})).isEqualTo(4);
    }    
}
