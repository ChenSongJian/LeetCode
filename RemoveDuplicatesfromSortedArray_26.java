// 26. Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int ptr = 1;
        while (ptr < nums.length) {
            if (nums[ptr] > nums[k]) {
                k++;
                nums[k] = nums[ptr];
            }
            ptr++;
        }
        return k + 1;
    }
}
