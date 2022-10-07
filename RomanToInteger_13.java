// 13. Roman to Integer

class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                if (i != s.length() - 1 && ((s.charAt(i + 1) == 'V') || (s.charAt(i + 1) == 'X'))) {
                    ans--;
                } else {
                    ans++;
                }
            } else if (s.charAt(i) == 'V') {
                ans = ans + 5;
            } else if (s.charAt(i) == 'X') {
                if (i != s.length() - 1 && ((s.charAt(i + 1) == 'L') || (s.charAt(i + 1) == 'C'))) {
                    ans = ans - 10;
                } else {
                    ans = ans + 10;
                }
            } else if (s.charAt(i) == 'L') {
                ans = ans + 50;
            } else if (s.charAt(i) == 'C') {
                if (i != s.length() - 1 && ((s.charAt(i + 1) == 'D') || (s.charAt(i + 1) == 'M'))) {
                    ans = ans - 100;
                } else {
                    ans = ans + 100;
                }
            } else if (s.charAt(i) == 'D') {
                ans = ans + 500;
            } else if (s.charAt(i) == 'M') {
                ans = ans + 1000;
            }
        }
        return ans;
    }
}
