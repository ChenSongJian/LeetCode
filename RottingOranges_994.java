// 994. Rotting Oranges

class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = -1;
        int numOrange = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    numOrange++;
                } else if (grid[i][j] == 2) {
                    queue.add(new int[] {i, j});
                }
            }
        }
        if (numOrange == 0) {
            return 0;
        }
        while (queue.isEmpty() == false) {
            int size = queue.size();
            count++;
            while (size > 0) {
                size--;
                int[] cur = queue.remove();
                if (cur[0] > 0 && grid[cur[0] - 1][cur[1]] == 1) {
                    queue.add(new int[] {cur[0] - 1, cur[1]});
                    grid[cur[0] - 1][cur[1]] = 2;
                    numOrange--;
                }
                if (cur[0] + 1 < m && grid[cur[0] + 1][cur[1]] == 1) {
                    queue.add(new int[] {cur[0] + 1, cur[1]});
                    grid[cur[0] + 1][cur[1]] = 2;
                   numOrange--;
                }
                if (cur[1] > 0 && grid[cur[0]][cur[1] - 1] == 1) {
                    queue.add(new int[] {cur[0], cur[1] - 1});
                    grid[cur[0]][cur[1] - 1] = 2;
                    numOrange--;
                }
                if (cur[1] + 1 < n && grid[cur[0]][cur[1] + 1] == 1) {
                    queue.add(new int[] {cur[0], cur[1] + 1});
                    grid[cur[0]][cur[1] + 1] = 2;
                    numOrange--;
                }
            }
        }
        if (numOrange == 0) {
            return count;
        } else {
            return -1;
        }
    }
}
