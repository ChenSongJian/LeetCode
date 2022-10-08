// 213. House Robber II

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);   
        }
        if (nums.length == 3) {
            return Math.max(nums[0], Math.max(nums[1], nums[2]));
        }
        
        int[] maxMoneyWithoutFirst = new int[nums.length];
        int[] maxMoneyWithoutLast = new int[nums.length];
        maxMoneyWithoutFirst[0] = 0;
        maxMoneyWithoutFirst[1] = nums[1];
        maxMoneyWithoutLast[0] = nums[0];
        maxMoneyWithoutLast[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            maxMoneyWithoutFirst[i] = Math.max(maxMoneyWithoutFirst[i - 2] + nums[i], maxMoneyWithoutFirst[i - 1]);
            if (i == nums.length - 1) {
                maxMoneyWithoutLast[i] = Math.max(maxMoneyWithoutLast[i - 2], maxMoneyWithoutLast[i - 1]);
            } else {
                maxMoneyWithoutLast[i] = Math.max(maxMoneyWithoutLast[i - 2] + nums[i], maxMoneyWithoutLast[i - 1]);
            }
        }
        return Math.max(maxMoneyWithoutFirst[nums.length - 1], maxMoneyWithoutLast[nums.length -1]);
    }
}
