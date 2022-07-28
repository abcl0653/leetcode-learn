package com.leetcode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class ArrayPartition561Test {

    @Test
    public void simpleCase() {
        ArrayPartition561 p = new ArrayPartition561();
        assertThat(
                p.arrayPairSum(new int[] { 1, 4, 2, 3 })).isEqualTo(4);

    }

    @Test
    public void simpleCase2() {
        ArrayPartition561 p = new ArrayPartition561();
        assertThat(
                p.arrayPairSum(new int[] { 6, 2, 6, 5, 1, 2 })).isEqualTo(9);

    }

    @Test
    public void simpleCase3() throws FileNotFoundException, IOException, org.json.simple.parser.ParseException {
        ArrayPartition561 a = new ArrayPartition561();

        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("testCases/ArrayPartition561.json"));

        int[] big = new int[20000];

        Object[] data = jsonArray.toArray();

        for (int i = 0; i < data.length; i++) {
            big[i] = Math.toIntExact((long) data[i]);
        }

        int b = a.arrayPairSum(big);
        assertThat(b).isEqualTo(236926);

    }

}
