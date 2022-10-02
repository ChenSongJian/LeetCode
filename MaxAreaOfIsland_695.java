// 695. Max Area of Island

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfsIslandArea(grid, i, j, 0));
                }
            }
        }
        return maxArea;
    }
    
    public int dfsIslandArea(int[][] grid, int r, int c, int count) {
        count++;
        grid[r][c] = 2;
        if (r > 0 && grid[r - 1][c] == 1) {
            count = dfsIslandArea(grid, r - 1, c, count);
        }
        if (r + 1< grid.length && grid[r + 1][c] == 1) {
            count = dfsIslandArea(grid, r + 1, c, count);
        }
        if (c > 0 && grid[r][c - 1] == 1) {
            count = dfsIslandArea(grid, r, c - 1, count);
        }
        if (c + 1< grid[0].length && grid[r][c + 1] == 1) {
            count = dfsIslandArea(grid, r, c + 1, count);
        }
        return count;
    }
}
