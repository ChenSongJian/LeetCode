// 55. Jump Game

class Solution {
    public boolean canJump(int[] nums) {
        int smallestIdToEnd = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if ((nums[i] + i) >= smallestIdToEnd) {
                smallestIdToEnd = i;
            }
        }
        return smallestIdToEnd == 0;
    }
}
