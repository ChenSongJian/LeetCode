// 91. Decode Ways

class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        int length = s.length();
        int[] ans = new int[length + 1];
        ans[0] = 1;
        for (int i = 1; i <= length; i++) {
            if (s.charAt(i - 1) != '0') {
                ans[i] = ans[i - 1];
            } 
            if (i > 1) {
                int prevTwoDigits = (s.charAt(i - 2) - '0') * 10 +  (s.charAt(i - 1) - '0');
                if (prevTwoDigits > 9 && prevTwoDigits < 27) {
                    ans[i] = ans[i] + ans[i - 2];
                }
            }
        }
        return ans[length];
    }
}
