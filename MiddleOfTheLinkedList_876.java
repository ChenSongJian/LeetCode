// 876. Middle of the Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode cur = head;
        ListNode ans = head;
        while (cur != null) {
            count = count + 1;
            cur = cur.next;
        }
        count = count / 2;
        while (count != 0) {
            count = count - 1;
            ans = ans.next;
        }
        return ans;
    }
}
