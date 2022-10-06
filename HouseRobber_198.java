// 198. House Robber

class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        } else if (len == 1) {
            return nums[0];
        } else if (len == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] maxAmount = new int[nums.length];
        maxAmount[0] = nums[0];
        maxAmount[1] = Math.max(maxAmount[0], nums[1]);
        for (int i = 2; i < len; i++) {
            maxAmount[i] = Math.max(maxAmount[i - 2] + nums[i], maxAmount[i - 1]);
        }
        return maxAmount[len - 1];
    }
}
