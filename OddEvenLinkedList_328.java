// 328. Odd Even Linked List

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
    public ListNode oddEvenList(ListNode head) {
        if (head != null) {
            ListNode evenDummyHead = new ListNode(-1, head.next);
            ListNode curOdd = head;
            ListNode curEven = evenDummyHead;
            while (curOdd != null) {
                curEven.next = curOdd.next;
                curEven = curEven.next;
                if (curOdd.next != null) {
                    curOdd.next = curOdd.next.next;
                    curOdd = curOdd.next;
                } else {
                    break;
                }
            }
            curOdd = head;
            while (curOdd.next != null) {
                curOdd = curOdd.next;
            }
            curOdd.next = evenDummyHead.next;
        }
        return head;
    }
}
