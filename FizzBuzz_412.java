// 412. Fizz Buzz

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<String>();
        String str;
        for (int i = 1; i <= n; i++) {
            str = "";
            if (i % 3 == 0) {
                str = str + "Fizz";
            }
            if (i % 5 == 0) {
                str = str + "Buzz";
            }
            if (str == "") {
                str = str + i;
            }
            ans.add(str);
        }
        return ans;
    }
}
