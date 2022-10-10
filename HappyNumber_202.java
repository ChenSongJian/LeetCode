// 202. Happy Number

class Solution {
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        int[] visited = new int[81 * 32 + 1]; // max=81 for each digit, at most 32 digits, 1-index
        while (n > 0) {
            int temp = n;
            int newN = 0;
            while (temp > 0) {
                newN = newN + (temp % 10) * (temp % 10);
                temp = temp / 10;
            }
            if (newN == 1) {
                return true;
            } else {
                if (visited[newN] == 1) {
                    return false;
                } else {
                    visited[newN] = 1;
                }
            }
            n = newN;
        }
        return false;
    }
}
