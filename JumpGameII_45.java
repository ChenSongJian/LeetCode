// 45. Jump Game II

class Solution {
    public int jump(int[] nums) {
        int[] steps = new int[nums.length];
        for (int i = 1; i < steps.length; i++) {
            steps[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < steps.length - 1; i++) {
            for (int j = 0; j <= nums[i] && i + j < steps.length; j++) {
                steps[i + j] = Math.min(steps[i + j], 1 + steps[i]);
            }
        }
        return steps[steps.length - 1];
    }
}
