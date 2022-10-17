// 15. 3Sum

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ansSet = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        ArrayList<Integer> sortedUniqueNums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            sortedUniqueNums.add(nums[i]);
        }
        
        int sortedUniqueNumsSize = sortedUniqueNums.size();
        for (int i = 0; i < sortedUniqueNumsSize - 2; i++) {
            int j = i + 1;
            int k = sortedUniqueNumsSize - 1;
            ansSet.addAll(twoSum(sortedUniqueNums, sortedUniqueNums.get(i), j, k));
        }
        for (List<Integer> arr: ansSet) {
            ans.add(arr);
        }
        return ans;
    }
    
    public List<List<Integer>> twoSum(List<Integer> sortedUniqueNums, int firstNum, int left, int right) {
        List<List<Integer>> ans = new ArrayList<>();
        while (left < right) {
            if (firstNum + sortedUniqueNums.get(left) + sortedUniqueNums.get(right) == 0) {
                List<Integer> cur = new ArrayList<>();
                cur.add(firstNum);
                cur.add(sortedUniqueNums.get(left));
                cur.add(sortedUniqueNums.get(right));
                ans.add(cur);
                left++;
                right--;
            } else if (firstNum + sortedUniqueNums.get(left) + sortedUniqueNums.get(right) > 0) {
                right--;
            } else {
                left++;
            }
        }
        
        return ans;
    }
}
