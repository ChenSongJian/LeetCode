// 200. Number of Islands

class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    grid = dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    
    public char[][] dfs(char[][] grid, int r, int c) {
        grid[r][c] = '2';
        if (r > 0 && grid[r - 1][c] == '1') {
            grid = dfs(grid, r - 1, c);
        }
        if (r + 1 < grid.length && grid[r + 1][c] == '1') {
            grid = dfs(grid, r + 1, c);
        }
        if (c > 0 && grid[r][c - 1] == '1') {
            grid = dfs(grid, r, c - 1);
        }
        if (c + 1 < grid[0].length && grid[r][c + 1] == '1') {
            grid = dfs(grid, r, c + 1);
        }
        return grid;
    }
}
