// 16. 3Sum Closest

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int difference = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return sum;
                } else if (difference > Math.abs(sum - target)) {
                    difference = Math.abs(sum - target);
                    ans = sum;
                }
                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return ans;
    }
}
