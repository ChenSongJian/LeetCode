// 438. Find All Anagrams in a String

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() >= p.length()) {    
            int[] sCount = new int[26];
            int[] pCount = new int[26];
            for (int i = 0; i < p.length(); i++) {
                pCount[p.charAt(i) - 'a']++;
                sCount[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < s.length() - p.length() + 1; i++) {
                boolean match = true;
                for (int j = 0; j < 26; j++) {
                    if(sCount[j] != pCount[j]) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    ans.add(i);
                }
                if (i + p.length() < s.length()) {
                    sCount[s.charAt(i) - 'a']--;
                    sCount[s.charAt(i + p.length()) - 'a']++;
                }
            }
        }
        return ans;
    }
}
