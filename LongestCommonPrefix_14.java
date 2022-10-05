// 14. Longest Common Prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        int index = 0;
        while (index < ans.length()) { 
            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length() || ans.charAt(index) != strs[i].charAt(index)) {
                    return ans.substring(0, index);
                }
            }
            index++;
        }
        return ans;
    }
}
