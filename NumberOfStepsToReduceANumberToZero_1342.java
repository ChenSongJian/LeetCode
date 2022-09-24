// 1342. Number of Steps to Reduce a Number to Zero

class Solution {
    public int numberOfSteps(int num) {
        if (num == 0) {
            return 0;
        }
        int count = 1;
        while (num != 1) {
            if (num % 2 == 1) {
                count = count + 2;
            } else {
                count = count + 1;
            }
            num = num / 2;
        }
        return count;
    }
}
