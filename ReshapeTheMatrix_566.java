// 566. Reshape the Matrix

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        int m = mat.length;
        int n = mat[0].length;
        if (r * c != m * n) {
            return mat;
        }
        int[] wholeMatrix = new int[m * n];
        int id = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                wholeMatrix[id] = mat[i][j];
                id++;
            }
        }
        id = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = wholeMatrix[id];
                id++;
            }
        }
        return ans;
    }
}
