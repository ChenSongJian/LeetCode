// 345. Reverse Vowels of a String

class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int right = str.length - 1;
        for (int i = 0; i < str.length && right >= 0; i++) {
            if (isVowel(str[i])) {
                boolean updated = false;
                while (right >= 0) {
                    if (isVowel(s.charAt(right))) {
                        str[i] = s.charAt(right);
                        updated = true;
                    }
                    right--;
                    if (updated) {
                        break;
                    }
                }
            }
        }
        return new String(str);
    }
    public boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U': return true;
            default: return false;
        }
    }
}
