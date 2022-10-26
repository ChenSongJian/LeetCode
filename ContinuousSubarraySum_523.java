// 523. Continuous Subarray Sum

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prevSum = new HashMap<>();
        prevSum.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = (sum + nums[i]) % k;
            if (prevSum.containsKey(sum)) {
                if (i - prevSum.get(sum) >= 2) {
                    return true;
                }
            } else {
                prevSum.put(sum, i);
            }
        }
        return false;
    }
}
