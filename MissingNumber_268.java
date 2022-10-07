// 268. Missing Number

class Solution {
    public int missingNumber(int[] nums) {
        int sumWithMissingNumber = (nums.length * (nums.length + 1)) / 2;
        for (int i = 0; i < nums.length; i++) {
            sumWithMissingNumber = sumWithMissingNumber - nums[i];
        }
        return sumWithMissingNumber;
    }
}
