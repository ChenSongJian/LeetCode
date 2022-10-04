// 122. Best Time to Buy and Sell Stock II

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int sum = 0;
        int buyIndex = 0;
        int sellIndex = buyIndex + 1;
        while (sellIndex < prices.length) {
            if (prices[sellIndex] < prices[sellIndex - 1]) {
                if (prices[sellIndex - 1] - prices[buyIndex] >= 0) {
                    sum = sum + prices[sellIndex - 1] - prices[buyIndex];
                }
                buyIndex = sellIndex;
            }
            sellIndex++;
        }
        if (prices[sellIndex - 1] > prices[buyIndex]) {
            sum = sum + prices[sellIndex - 1] - prices[buyIndex];
        }
        return sum;
    }
}
