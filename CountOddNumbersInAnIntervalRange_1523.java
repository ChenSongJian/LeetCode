// 1523. Count Odd Numbers in an Interval Range

class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        if ((low % 2 == 1) || (high % 2 == 1)) {
            count++;
        }
        return count + (high - low) / 2;
    }
}
