// 2095. Delete the Middle Node of a Linked List

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
    public ListNode deleteMiddle(ListNode head) {
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        if (count == 1) {
            return head.next;
        }
        count = count / 2;
        ListNode mid = head;
        while (count-- > 1) {
            mid = mid.next;
        }
        mid.next = mid.next.next;
        return head;
    }
}
