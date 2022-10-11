// 5. Longest Palindromic Substring

class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            String palindrome1 =  getLongestPalindromeFromMiddle(i, i, s);
            String palindrome2 = "";
            if (i + 1 < s.length()) {
                palindrome2 = getLongestPalindromeFromMiddle(i, i + 1, s);
            }
            if (palindrome1.length() > ans.length()) {
                ans = palindrome1;
            }
            if (palindrome2.length() > ans.length()) {
                ans = palindrome2;
            }
        }
        
        return ans;
    }
    
    public String getLongestPalindromeFromMiddle(int left, int right, String s) {
        String palindrome = "";
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            palindrome = s.substring(left, right + 1);
            left--;
            right++;
        }
        return palindrome;
    }
}
