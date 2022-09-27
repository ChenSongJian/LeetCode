// 977. Squares of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int idToAdd = nums.length - 1;
        int left = 0;
        int right = nums.length - 1;
        while (idToAdd >= 0) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                ans[idToAdd] = nums[left] * nums[left];
                left++;
            } else {
                ans[idToAdd] = nums[right] * nums[right];
                right--;
            }
            idToAdd--;
        }
        return ans;
    }
}
