// 409. Longest Palindrome

class Solution {
    public int longestPalindrome(String s) {
        int result = 0;
        int[] charCount = new int[52];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                charCount[s.charAt(i) - 'a']++;
                if (charCount[s.charAt(i) - 'a'] % 2 == 0) {
                    result = result + 2;
                }
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                charCount[s.charAt(i) - 'A' + 26]++;
                if (charCount[s.charAt(i) - 'A' + 26] % 2 == 0) {
                    result = result + 2;
                }
            }
        }
        if (result < s.length()) {
            result++;
        }
        return result;
    }
}
