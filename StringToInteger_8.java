// 8. String to Integer (atoi)

class Solution {
    public int myAtoi(String s) {
        int length = s.length();
        int ptr = 0;
        int ans = 0;
        boolean positive = true;
        while (ptr < length && s.charAt(ptr) == ' ') {
            ptr++;
        }
        if (ptr < length) {
            if (s.charAt(ptr) == '+') {
                positive = true;
                ptr++;
            } else if (s.charAt(ptr) == '-') {
                positive = false;
                ptr++;
            }
        }
        while (ptr < length && Character.isDigit(s.charAt(ptr))) {
            int cur = s.charAt(ptr) - '0';
            if (ans > Integer.MAX_VALUE / 10 || ((ans == Integer.MAX_VALUE / 10) && (cur > Integer.MAX_VALUE % 10))) {
                if (positive) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            ans = ans * 10 + cur;
            ptr++;
        }
        if (positive) {
            return ans;
        } else {
            return ans * -1;
        }
    }
}
