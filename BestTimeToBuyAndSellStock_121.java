// 121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int curMin = prices[0];
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < curMin) {
                curMin = prices[i];
            }
            if (prices[i] - curMin > result) {
                result = prices[i] - curMin;
            }
        }
        return result;
    }
}
