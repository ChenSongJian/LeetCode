// 461. Hamming Distance

class Solution {
    public int hammingDistance(int x, int y) {
        int ans = 0;
        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);
        int lengthDiff = binaryX.length() - binaryY.length();
        String leadingZero = "";
        if (lengthDiff > 0) {
            for (int i = 0; i < lengthDiff; i++) {
                leadingZero = leadingZero + "0";
            }
            binaryY = leadingZero + binaryY;
        } else {
            for (int i = 0; i < lengthDiff * -1; i++) {
                leadingZero = leadingZero + "0";
            }
            binaryX = leadingZero + binaryX;
        }
        for (int i = 0; i < binaryX.length(); i++) {
            if (binaryX.charAt(i) != binaryY.charAt(i)) {
                ans++;
            }
        }
        return ans;
    }
}
