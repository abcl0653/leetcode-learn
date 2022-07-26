package com.leetcode;

import static org.assertj.core.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
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
