//392. Is Subsequence

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        if (t.length() == 0) {
            return false;
        }
        int sID = 0;
        int tID = 0;
        while (tID < t.length()) {
            if (s.charAt(sID) == t.charAt(tID)) {
                sID++;
                if (sID == s.length()) {
                    return true;
                }
            }
            tID++;
        }
        return false;
    }
}
