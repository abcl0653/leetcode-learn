package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PascalTriangle118Test {

    @Test
    public void simpleCase() {
        PascalTriangle118 p = new PascalTriangle118();

        List<List<Integer>> a = new ArrayList<>();
        List<Integer> e = new ArrayList<>();
        e.add(1);
        a.add(e);
        assertThat(
                p.generate(1)).isEqualTo(a);
    }


    @Test
    public void simpleCase2() {
        PascalTriangle118 p = new PascalTriangle118();

        List<List<Integer>> a = new ArrayList<>();
        
        List<Integer> e = Arrays.asList(1);
        a.add(e);

        e = Arrays.asList(1,1);
        a.add(e);

        e = Arrays.asList(1,2,1);
        a.add(e);
        

        e = Arrays.asList(1,3,3,1);
        a.add(e);


        e = Arrays.asList(1,4,6,4,1);
        a.add(e);
        assertThat(
                p.generate(5)).isEqualTo(a);
    }
}
