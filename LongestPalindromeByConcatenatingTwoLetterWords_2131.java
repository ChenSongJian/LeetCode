// 2131. Longest Palindrome by Concatenating Two Letter Words

class Solution {
    public int longestPalindrome(String[] words) {
        int ans = 0;
        int[][] wordCount = new int[26][26];
        for (int i = 0; i < words.length; i++) {
            if (wordCount[words[i].charAt(1) - 'a'][words[i].charAt(0) - 'a'] <= 0) {
                wordCount[words[i].charAt(0) - 'a'][words[i].charAt(1) - 'a']++;
            } else {
                ans = ans + 4;
                wordCount[words[i].charAt(1) - 'a'][words[i].charAt(0) - 'a']--;
            }
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (wordCount[i][j] > 0 && i == j) {
                    return ans + 2;
                }
            }
        }
        return ans;
    }
}
