// 567. Permutation in String

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] charCountS1 = new int[26];
        int[] charCountS2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            charCountS1[s1.charAt(i) - 'a']++;
            charCountS2[s2.charAt(i) - 'a']++;
        }
        int left = 0;
        int right = s1.length() - 1;
        while (right < s2.length()) {
            boolean found = true;
            for (int i = left; i <= right; i++) {
                if (charCountS1[s2.charAt(i) - 'a'] != charCountS2[s2.charAt(i) - 'a']) {
                    found = false;
                }
            }
            if (found) {
                return true;
            } else {
                charCountS2[s2.charAt(left) - 'a']--;
                if (right == s2.length() - 1) {
                    return false;
                }
                left++;
                right++;
                charCountS2[s2.charAt(right) - 'a']++;
            }
        }
        return false;
    }
}
