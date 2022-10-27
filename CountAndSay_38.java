// 38. Count and Say

class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String strN = countAndSay(n - 1);
        String ans = "";
        int left = 0;
        int right = 1;
        while (right < strN.length()) {
            if (strN.charAt(left) == strN.charAt(right)) {
                right++;
            } else {
                ans = ans + (right - left);
                ans = ans + strN.charAt(left);
                left = right;
            }
        }
        ans = ans + (right - left);
        ans = ans + strN.charAt(left);
        left = right;
        return ans;
    }
}
