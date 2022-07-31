package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class TwoSumII167Test {

    @Test
    public void simpleCase() {
        TwoSumII167 t = new TwoSumII167();
        assertThat(
                t.twoSum(new int[] { 2, 7, 11, 15 }, 9)).isEqualTo(new int[] { 1, 2 });
    }

    @Test
    public void simpleCase2() {
        TwoSumII167 t = new TwoSumII167();
        assertThat(
                t.twoSum(new int[] { 2, 3, 4 }, 6)).isEqualTo(new int[] { 1, 3 });
    }

    @Test
    public void simpleCase3() {
        TwoSumII167 t = new TwoSumII167();
        assertThat(
                t.twoSum(new int[] { -1, 0 }, -1)).isEqualTo(new int[] { 1, 2 });
    }

    @Test
    public void simpleCase4() {
        TwoSumII167 t = new TwoSumII167();
        assertThat(
                t.twoSum(new int[] { 0, 0, 3, 4 }, 0)).isEqualTo(new int[] { 1, 2 });
    }


    @Test
    public void simpleCase5() throws FileNotFoundException, IOException, ParseException {
        TwoSumII167 t = new TwoSumII167();
        assertThat(
                t.twoSum(new int[] { 0, 0, 0, 0, 0, 2,3, 9,9, 9, 9, 9 }, 5)).isEqualTo(new int[] { 6, 7 });


                JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("testCases/TwoSumII167.json"));

        int[] big = new int[26020];

        Object[] data = jsonArray.toArray();

        for (int i = 0; i < data.length; i++) {
            big[i] = Math.toIntExact((long) data[i]);
        }

        assertThat(
            t.twoSum(big, 5)
        ).isEqualTo(new int[]{13011,13012});

    }

    @Test
    public void binSearchTest() {
        TwoSumII167 t = new TwoSumII167();

        assertThat(
                t.binSearch(new int[] { 1, 2, 3, 5, 6, 7, 9, 13, 15 }, 0, 8, 9)).isEqualTo(6);
        assertThat(
                t.binSearch(new int[] { 1, 2, 3, 5, 6, 7, 9, 13, 15 }, 0, 8, 8)).isEqualTo(1001);
    }
}
