// 1137. N-th Tribonacci Number

class Solution {
    public int tribonacci(int n) {
        if (n < 2) {
            return n;
        }
        int[] tri = new int[n + 1];
        tri[1] = 1;
        tri[2] = 1;
        for (int i = 3; i <= n; i++) {
            tri[i] = tri[i - 3] + tri[i - 2] + tri[i - 1];
        }
        return tri[n];
    }
}
