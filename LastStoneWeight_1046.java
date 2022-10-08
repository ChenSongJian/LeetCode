// 1046. Last Stone Weight

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < stones.length; i++) {
            pq.add(-1 * stones[i]);
        }
        while (pq.size() > 1) {
            int y = -1 * pq.poll();
            int x = -1 * pq.poll();
            if (x != y) {
                pq.add(-1 * (y - x));
            }
        }
        if (pq.size() == 1) {
            return -1 * pq.poll();
        } else {
            return 0;
        }
    }
}
