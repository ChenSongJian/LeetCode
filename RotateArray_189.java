// 189. Rotate Array

class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] ans = new int[length];
        for (int i = 0; i < length; i++) {
            ans[(i + k) % length] = nums[i];
        }
        for (int i = 0; i < length; i++) {
            nums[i] = ans[i];
        }
    }
}
