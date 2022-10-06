// 424. Longest Repeating Character Replacement

class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        int maxCharCount = 0;
        int maxLength = 0;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            if (charCountMap.containsKey(s.charAt(right))) {
                charCountMap.put(s.charAt(right), charCountMap.get(s.charAt(right)) + 1);
            } else {
                charCountMap.put(s.charAt(right), 1);
            }
            
            if (charCountMap.get(s.charAt(right)) > maxCharCount) {
                maxCharCount = charCountMap.get(s.charAt(right));
            }
            
            if (((right - left + 1) - maxCharCount) > k) {
                charCountMap.put(s.charAt(left), charCountMap.get(s.charAt(left)) - 1);
                left++;
            }
            
            if ((right - left + 1) > maxLength) {
                maxLength = right - left + 1;
            }
            
            right++;
        } 
        
        return maxLength;
    }
}
