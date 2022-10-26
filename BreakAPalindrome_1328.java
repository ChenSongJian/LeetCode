// 1328. Break a Palindrome

class Solution {
    public String breakPalindrome(String palindrome) {
        int length = palindrome.length();
        if (length < 2) {
            return "";
        }
        int indexFirstNonA = -1;
        for (int i = 0; i < length; i++) {
            if (palindrome.charAt(i) != 'a' && i != length / 2) {
                indexFirstNonA = i;
                break;
            }
        }
        if (indexFirstNonA == -1) {
            return palindrome.substring(0, length - 1) + "b";
        }
        return palindrome.substring(0, indexFirstNonA) + "a" + palindrome.substring(indexFirstNonA + 1);
    }
}
