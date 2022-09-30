// 278. First Bad Version

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long left = 1;
        long right = n;
        int bad = n;
        int middle;
        while (left <= right) {
            middle = (int) ((left + right) / 2);
            if (isBadVersion(middle) == true) {
                bad = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return bad;
    }
}
