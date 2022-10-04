// 784. Letter Case Permutation

class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        permutate(ans, s.toCharArray(), 0);
        return ans;
    }
    
    public void permutate(List<String> ans, char[] str, int index) {
        if (index == str.length) {
            ans.add(new String(str));
            return;
        }
        if (Character.isLetter(str[index])) {
            str[index] = Character.toUpperCase(str[index]);
            permutate(ans, str, index + 1);
            str[index] = Character.toLowerCase(str[index]);
            permutate(ans, str, index + 1);
        } else {
            permutate(ans, str, index + 1);
        }
    }
}
