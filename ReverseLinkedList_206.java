// 206. Reverse Linked List

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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        Stack<Integer> values = new Stack<Integer>();
        while (head.next != null) {
            values.push(head.val);
            head = head.next;
        }
        ListNode cur = head;
        while (values.isEmpty() == false) {
            cur.next = new ListNode(values.peek(), null);
            values.pop();
            cur = cur.next;
        }
        return head;
    }
}
