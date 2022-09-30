// 74. Search a 2D Matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix[0][0] > target) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] > target) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i - 1][j] == target) {
                        return true;
                    }
                }
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[matrix.length - 1][i] == target) {
                return true;
            }
        }
        return false;
    }
}
