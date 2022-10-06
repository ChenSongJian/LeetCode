// 191. Number of 1 Bits

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String binaryN = Integer.toBinaryString(n);
        int ans = 0;
        for (int i = 0; i < binaryN.length(); i++) {
            if (binaryN.charAt(i) == '1') {
                ans++;
            }
        }
        return ans;
    }
}
