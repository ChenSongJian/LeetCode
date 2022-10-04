// 77. Combinations

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        if (n == k) {
            ans.add(nums);
        } else {
            backtrack(ans, nums, k, new ArrayList<Integer>(), 0);   
        }
        return ans;
    }
    
    public void backtrack(List<List<Integer>> ans, List<Integer> nums, int k, List<Integer> arr, int index) {
        if (k == 0) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        for (int i = index; i < nums.size(); i++) {
            arr.add(nums.get(i));
            backtrack(ans, nums, k - 1, arr, i + 1);
            arr.remove(arr.size() - 1);
        }
    }
}

            
            
