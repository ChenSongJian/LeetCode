// 7. Reverse Integer

class Solution {
    public int reverse(int x) {
        String before = String.valueOf(x);
        String after = "";
        if (x < 0) {
            before = before.substring(1);
            after = "-";
        }
        for (int i = before.length() - 1; i >= 0; i--) {
            after = after + before.charAt(i);
        }
        long longAns = Long.parseLong(after);
        if (longAns > Integer.MAX_VALUE || longAns < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) longAns;
    }
}
