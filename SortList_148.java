// 148. Sort List

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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode dummyHead = new ListNode(-1, head);
        ListNode cur = dummyHead.next;
        while (cur != null) {
            arr.add(cur.val);
            cur = cur.next;
        }
        Collections.sort(arr);
        cur = dummyHead;
        for (int i = 0; i < arr.size(); i++) {
            ListNode temp = new ListNode(arr.get(i), null);
            cur.next = temp;
            cur = cur.next;
        }
        return dummyHead.next;
    }
}
