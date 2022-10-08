// 740. Delete and Earn

class Solution {
    public int deleteAndEarn(int[] nums) {
        int ans = 0;
        int pre = 0;
        int[] sumNum = new int[10001];
        for (int i = 0; i < nums.length; i++) {
            sumNum[nums[i]] = sumNum[nums[i]] + nums[i];
        }
        for (int i = 1; i < 10001; i++) {
            int temp = Math.max(pre + sumNum[i], ans);
            pre = ans;
            ans = temp;
        }
        return ans;
    }
}
