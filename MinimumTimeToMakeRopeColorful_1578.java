// 1578. Minimum Time to Make Rope Colorful

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum = 0;
        for (int i = 0; i < colors.length() - 1; i++) {
            if (colors.charAt(i) == colors.charAt(i + 1)) {
                if (neededTime[i] > neededTime[i + 1]) {
                    sum = sum + neededTime[i + 1];
                    neededTime[i + 1] = neededTime[i];
                } else {
                    sum = sum + neededTime[i];
                }
            }
        }
        return sum;
    }
}
