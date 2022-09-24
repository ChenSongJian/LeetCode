// 724. Find Pivot Index

class Solution {
    public int pivotIndex(int[] nums) {
        int length = nums.length;
        int sum = 0;
        int leftSum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + nums[i];
        }
        for (int j = 0; j < length; j++) {
            if (2 * leftSum + nums[j] == sum) {
                return j;
            } else {
                leftSum = leftSum + nums[j];
            }
        }
        return -1;
    }
}
