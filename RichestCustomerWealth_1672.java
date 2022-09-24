// 1672. Richest Customer Wealth

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        int curWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            curWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                curWealth = curWealth + accounts[i][j];
            }
            if (curWealth > maxWealth) {
                maxWealth = curWealth;
            }
        }
        return maxWealth;
    }
}
