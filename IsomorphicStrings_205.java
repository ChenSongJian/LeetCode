// 205. Isomorphic Strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> StoT = new HashMap<Character, Character>();
        HashMap<Character, Character> TtoS = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            // check if S -> T mapping exists and correct
            if (StoT.containsKey(s.charAt(i))) {
                if (StoT.get(s.charAt(i)) == t.charAt(i)) {
                    // check if T -> S mapping exists and correct
                    if (TtoS.containsKey(t.charAt(i))) {
                        if (TtoS.get(t.charAt(i)) != s.charAt(i)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                // T -> S mapping exists but no S -> T mapping
                if (TtoS.containsKey(t.charAt(i))) {
                    return false;
                } else {
                    StoT.put(s.charAt(i), t.charAt(i));
                    TtoS.put(t.charAt(i), s.charAt(i));
                }
            }
        }
        return true;
    }
}
