// 1. Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> idVal = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            if (idVal.containsKey(target - nums[i])) {
                return new int[] {idVal.get(target - nums[i]), i};
            } else {
                idVal.put(nums[i], i);
            }
        }
        return new int[] {0, 0}; // should never reach here
    }
}
