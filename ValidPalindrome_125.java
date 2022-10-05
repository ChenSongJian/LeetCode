// 125. Valid Palindrome

class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                newStr = newStr + Character.toLowerCase(s.charAt(i));
            }
        }
        for (int i = 0; i < newStr.length() / 2; i++) {
            if (newStr.charAt(i) != newStr.charAt(newStr.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
