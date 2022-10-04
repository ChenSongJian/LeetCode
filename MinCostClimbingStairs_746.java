// 746. Min Cost Climbing Stairs

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length + 1];
        for (int i = 2; i < minCost.length; i++) {
            minCost[i] = Math.min((minCost[i - 2] + cost[i - 2]), (minCost[i - 1] + cost[i - 1]));
        }
        return minCost[cost.length];
    }
}
