// 733. Flood Fill

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }
        int m = image.length;
        int n = image[0].length;
        int oldColor = image[sr][sc];
        image[sr][sc] = color;
        
        if (sr > 0 && image[sr - 1][sc] == oldColor) {
            image = floodFill(image, sr - 1, sc, color);
        }
        if (sr < m - 1 && image[sr + 1][sc] == oldColor) {
            image = floodFill(image, sr + 1, sc, color);
        }
        if (sc > 0 && image[sr][sc - 1] == oldColor) {
            image = floodFill(image, sr, sc - 1, color);
        }
        if (sc < n - 1 && image[sr][sc + 1] == oldColor) {
            image = floodFill(image, sr, sc + 1, color);
        }
        return image;
    }
}
