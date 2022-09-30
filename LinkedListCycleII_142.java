// 142. Linked List Cycle II

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<ListNode>();
        while (head != null && visited.contains(head) == false) {
            visited.add(head);
            head = head.next;
        }
        return head;
    }
}
