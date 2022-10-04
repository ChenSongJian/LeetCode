// 509. Fibonacci Number

class Solution {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int[] fi = new int[n + 1];
        fi[1] = 1;
        for (int i = 2; i <= n; i++) {
            fi[i] = fi[i - 2] + fi[i - 1];
        }
        return fi[n];
    }
}
