// 234. Palindrome Linked List

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
    public boolean isPalindrome(ListNode head) {
        List<Integer> listVal = new ArrayList<>();
        ListNode cur1 = head;
        while (cur1 != null) {
            listVal.add(cur1.val);
            cur1 = cur1.next;
        }
        ListNode cur2 = head;
        for (int i = listVal.size() - 1; i >= 0; i--) {
            if (listVal.get(i) != cur2.val) {
                return false;
            }
            cur2 = cur2.next;
        }
        return true;
    }
}
