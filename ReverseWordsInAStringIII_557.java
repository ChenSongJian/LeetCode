// 557. Reverse Words in a String III

class Solution {
    public String reverseWords(String s) {
        String[] splited = s.split(" ");
        for (int i = 0; i < splited.length; i++) {
            StringBuffer sbStr = new StringBuffer(splited[i]);
            splited[i] = sbStr.reverse().toString();
        }
        return String.join(" ", splited);
    }
}
