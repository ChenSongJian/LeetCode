// 645. Set Mismatch

class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> correctSet = new HashSet<Integer>();
        for (int i = 1; i <= nums.length; i++) {
            correctSet.add(i);
        }
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (correctSet.contains(nums[i])) {
                correctSet.remove(nums[i]);
            } else {
                ans[0] = nums[i];
            }
        }
        for (int missingNum: correctSet) {
            ans[1] = missingNum;
        }
        return ans; 
    }
}
