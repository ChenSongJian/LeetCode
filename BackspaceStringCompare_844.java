// 844. Backspace String Compare

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                sStack.push(s.charAt(i));
            } else if (s.charAt(i) == '#' && sStack.size() > 0) {
                sStack.pop();
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (Character.isLetter(t.charAt(i))) {
                tStack.push(t.charAt(i));
            } else if (t.charAt(i) == '#' && tStack.size() > 0) {
                tStack.pop();
            }
        }
        if (sStack.size() != tStack.size()) {
            return false;
        } 
        while (sStack.isEmpty() == false) {
            if (sStack.pop() != tStack.pop()) {
                return false;
            }
        }
        return true;
    }
}
