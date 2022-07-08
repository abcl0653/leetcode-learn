package com.leetcode;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;


public class NumberOfIslandTest {

    @Test
    public void expample1() {
        NumberOfIsland num = new NumberOfIsland();
        char[][] grid = new char[4][5];

        grid[0][0] = '1'; grid[0][1] = '1'; grid[0][2] = '1'; grid[0][3] = '1'; grid[0][4] = '0';
        grid[1][0] = '1'; grid[1][1] = '1'; grid[1][2] = '0'; grid[1][3] = '1'; grid[1][4] = '0';
        grid[2][0] = '1'; grid[2][1] = '1'; grid[2][2] = '0'; grid[2][3] = '0'; grid[2][4] = '0';
        grid[3][0] = '0'; grid[3][1] = '0'; grid[3][2] = '0'; grid[3][3] = '0'; grid[3][4] = '0';

        // assertThat(num.numIslands(grid)).isEqualTo(1);


        grid = new char[][] { {'1','1','1'},{'0','1','0'},{'1','1','1'} };

        assertThat(num.numIslands(grid)).isEqualTo(1);
    }
}
