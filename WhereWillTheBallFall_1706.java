// 1706. Where Will the Ball Fall

class Solution {
    public int[] findBall(int[][] grid) {
        int[] ans = new int[grid[0].length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = i;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                if (ans[j] != -1) {
                    if (ans[j] == 0) {
                        if (grid[i][0] == -1) {
                            ans[j] = -1;
                        } else {
                            if (ans[j] + 1 < ans.length) {
                                if (grid[i][ans[j] + 1] == 1) {
                                    ans[j]++;
                                } else {
                                    ans[j] = -1;
                                }
                            } else {
                                ans[j] = -1;
                            }
                        }
                    } else if (ans[j] == ans.length - 1) {
                        if (grid[i][ans.length - 1] == 1) {
                            ans[j] = -1;
                        } else {
                            if (ans[j] - 1 >= 0) {
                                if (grid[i][ans[j] - 1] == -1) {
                                    ans[j]--;
                                } else {
                                    ans[j] = -1;
                                }
                            } else {
                                ans[j] = -1;
                            }
                        }
                    } else {
                        if (grid[i][ans[j]] == -1) {
                            if (grid[i][ans[j] - 1] == -1) {
                                ans[j]--;
                            } else {
                                ans[j] = -1;
                            }
                        } else {
                            if (grid[i][ans[j] + 1] == 1) {
                                ans[j]++;
                            } else {
                                ans[j] = -1;
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}
