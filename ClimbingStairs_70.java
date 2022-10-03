// 70. Climbing Stairs

class Solution {
    public int climbStairs(int n) {
        int[] steps = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i < 4) {
                steps[i] = i;
            } else {
                steps[i] = steps[i - 1] + steps[i - 2];
            }
        }
        return steps[n];
    }
}
