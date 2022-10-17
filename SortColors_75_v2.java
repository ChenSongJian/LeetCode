// 75. Sort Colors

class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            }
        }
        int index = 0;
        while (index < nums.length) {
            while (count0 > 0) {
                nums[index] = 0;
                index++;
                count0--;
            }
            while (count1 > 0) {
                nums[index] = 1;
                index++;
                count1--;
            }
            if (index >= nums.length) {
                break;
            }
            nums[index] = 2;
            index++;
        }
    }
}
