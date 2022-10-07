// 190. Reverse Bits

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String binaryN = Integer.toBinaryString(n);
        if (binaryN.length() < 32); {
            String leadingZero = "";
            for (int i = 0; i < 32 - binaryN.length(); i++) {
                leadingZero = leadingZero + "0";
            }
            binaryN = leadingZero + binaryN;
        }
        char[] charArrayN = binaryN.toCharArray();
        for (int i = 0; i < 16; i++) {
            char temp = charArrayN[i];
            charArrayN[i] = charArrayN[31 - i];
            charArrayN[31 - i] = temp;
        }
        return Integer.parseUnsignedInt(new String(charArrayN), 2);
    }
}
