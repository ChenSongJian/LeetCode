// 542. 01 Matrix

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        while (true) {
            boolean updated = false;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (mat[i][j] != 0) {
                        int up = (i > 0 ? mat[i - 1][j] : Integer.MAX_VALUE);
                        int down = (i + 1 < mat.length ? mat[i + 1][j] : Integer.MAX_VALUE);
                        int left = (j > 0 ? mat[i][j - 1] : Integer.MAX_VALUE);
                        int right = (j + 1 < mat[0].length ? mat[i][j + 1] : Integer.MAX_VALUE);
                        if (mat[i][j] < Math.min(Math.min(Math.min(up, down), left), right) + 1) {
                            updated = true;
                            mat[i][j] = Math.min(Math.min(Math.min(up, down), left), right) + 1;
                        }
                    }
                }
            }
            if (updated == false) {
                break;
            }
        }
        return mat;
    }
}
