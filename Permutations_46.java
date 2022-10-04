// 46. Permutations

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, nums, 0);
        return ans;
    }
    
    public void backtrack(List<List<Integer>> ans, int[] nums, int index) {
        if (index == nums.length) {
            ArrayList<Integer> newPermutation = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                newPermutation.add(nums[i]);
            }
            ans.add(newPermutation);
        }
        for (int i = index; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[index]; 
            nums[index] = temp;
            backtrack(ans, nums, index + 1);
            temp = nums[i];
            nums[i] = nums[index]; 
            nums[index] = temp;
        }
    }
}
