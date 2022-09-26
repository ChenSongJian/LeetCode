21. Merge Two Sorted Lists

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(-1, null);
        ListNode temp = dummyHead;
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        while (cur1 != null && cur2 != null) {
            if (cur1.val < cur2.val) {
                temp.next = cur1;
                cur1 = cur1.next;
            } else {
                temp.next = cur2;
                cur2 = cur2.next;
            }
            temp = temp.next;
        }
        if (cur1 == null) {
            temp.next = cur2;
        } else if (cur2 == null) {
            temp.next = cur1;
        }
        return dummyHead.next;
    }
}
