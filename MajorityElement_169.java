// 169. Majority Element

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (countMap.containsKey(nums[i])) {
                countMap.put(nums[i], countMap.get(nums[i]) + 1);
            } else {
                countMap.put(nums[i], 1);
            }
            if (countMap.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return 0; // should never reach here
    }
}
