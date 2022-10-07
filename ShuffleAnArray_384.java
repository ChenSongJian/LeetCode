// 384. Shuffle an Array

class Solution {
    int[] arr;
    public Solution(int[] nums) {
        arr = nums;
    }
    
    public int[] reset() {
        return arr;
    }
    
    public int[] shuffle() {
        ArrayList<Integer> tempArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            tempArr.add(arr[i]);
        }
        Collections.shuffle(tempArr);
        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = tempArr.get(i);
        }
        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
