// 35. Search Insert Position

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle;
        int position = 0;
        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                position = middle + 1;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return position;
    }
}
