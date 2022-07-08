package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Problem: 286. Walls and Gates
 * 
 * You are given a m x n 2D grid initialized with these three possible values.
 *  1.  -1 - A wall or an obstable.
 *  2.  0 - A gate.
 *  3.  INF - infinity means an empty room. We use the valie 2^31 - 1 = 2147483647 to represnt
 *      INF as you may assume that the distance to a gate is less than ///
 * Fill each empty room with distance to its nearest gate.
 * If it is impossible to reach a gate, it should be filled with INF.
 */

public class NumberOfIsland {

    private Queue<int[]> queue = new LinkedList<>();

    public int numIslands(char[][] grid) {
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    queue.add(new int[] { i, j });
                    result ++ ;
                    while (!queue.isEmpty()) {
                        int[] index = queue.poll();
                        int r = index[0]; int c = index[1];
                        // if (grid[r][c] == '1'){

                            grid[r][c] = '0';

                            if (r - 1 >= 0 && grid[r-1][c] == '1')  queue.add(new int[] {r-1, c});
                            if (r + 1 < grid.length && grid[r+1][c] == '1')  queue.add(new int[] {r+1, c});
                            if (c - 1 >= 0 && grid[r][c-1] == '1')  queue.add(new int[] {r, c-1});
                            if (c + 1 < grid[0].length  && grid[r][c+1] == '1')  queue.add(new int[] {r, c+1});
                            
                        // }
                    }
                }

            }
        }

        return result;
    }

}