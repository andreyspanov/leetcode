package leetcode.leetcode695;

class Solution {

    /**
     * Time Complexity: O(N * M) where N and M are the lengths of the sides of the grid
     * Space Complexity: O(L) where L is the size of the largest island, representing the maximum recursion stack
     * or O(N * M + L) if we create an N * M matrix in order to not modify the input
     */
    public static int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }

    public static int dfs(int[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x > grid.length - 1 || y > grid[0].length - 1 || grid[x][y] == 0) {
            return 0;
        }

        grid[x][y] = 0;
        return 1 + dfs(grid, x, y + 1) + dfs(grid, x, y - 1) + dfs(grid, x + 1, y) + dfs(grid, x - 1, y);
    }
}