// 283. Move Zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (right > 0) {
            if (nums[right] == 0) {
                right--;
            } else {
                break;
            }
        }
        while (left <= right) {
            if (nums[left] == 0) {
                for (int i = left + 1; i <= right; i++) {
                    nums[i - 1] = nums[i];
                    nums[i] = 0;
                }
                right--;
            }
            if (nums[left] != 0) {
                left++;
            }
        }
    }
}
