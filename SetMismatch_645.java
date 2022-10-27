// 645. Set Mismatch

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] bucket = new int[nums.length + 1];
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (bucket[nums[i]] == 1) {
                ans[0] = nums[i];
            }
            bucket[nums[i]]++; 
        }
        for (int i = 1; i <= nums.length; i++) {
            if (bucket[i] == 0) {
                ans[1] = i;
                return ans;
            }
        }
        return ans; // should not reach here;
    }
}
