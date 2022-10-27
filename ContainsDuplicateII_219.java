// 219. Contains Duplicate II

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> numsLastId = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsLastId.containsKey(nums[i]) && (i - numsLastId.get(nums[i]) <= k)) {
                return true;
            } else {
                numsLastId.put(nums[i], i);
            }
        }
        return false;
    }
}
