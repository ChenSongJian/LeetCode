// 75. Sort Colors

class Solution {
    public void sortColors(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for (; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        i = 0;
        while (pq.isEmpty() == false) {
            nums[i] = pq.remove();
            i++;
        }
    }
}
