// 1480. Running Sum of 1d Array

class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        ans[0] = nums[0];
        for (int i = 1; i < length; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }
        return ans;
    }
}
