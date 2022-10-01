// 3. Longest Substring Without Repeating Characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        Map<Character, Integer> charFound = new HashMap<>();
        for (int left = 0, right = 0; right < s.length(); right++) {
            if (charFound.containsKey(s.charAt(right))) {
                if (charFound.get(s.charAt(right)) > left) {
                    left = charFound.get(s.charAt(right));
                }
            }
            charFound.put(s.charAt(right), right + 1);
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
            }
        }
        return maxLen;
    }
}
