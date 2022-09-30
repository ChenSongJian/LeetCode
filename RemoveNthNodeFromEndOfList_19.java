// 19. Remove Nth Node From End of List

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode countNode = head;
        ListNode removeNode = head;
        int count = 0;
        while (countNode != null) {
            countNode = countNode.next;
            count++;
        }
        if (count == n) {
            head = head.next;
            return head;
        }
        while (count - n > 1) {
            removeNode = removeNode.next;
            n++;
        }
        removeNode.next = removeNode.next.next;
        return head;
    }
}
