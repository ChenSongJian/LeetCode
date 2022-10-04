// 374. Guess Number Higher or Lower

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long left = 1;
        long right = n;
        while (left <= right) {
            int middle = (int) ((left + right) / 2);
            if (guess(middle) == 0) {
                return middle;
            } else if (guess(middle) == -1) {
                right = middle - 1;
            } else if (guess(middle) == 1) {
                left = middle + 1;
            }
        }
        return 0;
    }
}
