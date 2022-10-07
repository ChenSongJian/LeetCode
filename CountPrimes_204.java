// 204. Count Primes

class Solution {
    public int countPrimes(int n) {
        boolean prime[] = new boolean[n];
        int ans = 0;
        for (int i = 0; i < n; i++)
            prime[i] = true;
        for (int p = 2; p * p < n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i < n; i = i + p) {
                    prime[i] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (prime[i] == true)
                ans++;
        }
        return ans;
    }
}
