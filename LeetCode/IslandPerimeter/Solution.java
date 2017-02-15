package LeetCode.IslandPerimeter;

// Given grid array of 0s and 1s representing squares on a rectangular grid. 
// 1 represents land, find the perimeter of the land.

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int[] previousRow = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;
                    if (j != 0 && grid[i][j-1] == 1) {
                        perimeter -= 2;
                    }
                    if (previousRow[j] == 1) {
                        perimeter -= 2;
                    }
                }
                previousRow[j] = grid[i][j];
            }
        }
        return perimeter;
    }
}