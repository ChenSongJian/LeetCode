// 283. Move Zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length > 1) {
            int left = 0;
            while (left < nums.length && nums[left] != 0) {
                left++;
            }
            int right = left + 1;
            while (right < nums.length) {
                if (nums[right] != 0) {
                    nums[left] = nums[right];
                    nums[right] = 0;
                    left++;
                }
                right++;
            }
        }
    }
}
