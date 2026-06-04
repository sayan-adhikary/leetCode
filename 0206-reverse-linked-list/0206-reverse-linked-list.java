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
        if (head == null || head.next == null) {
			return head;
		}
		
		ListNode prev = null;
		ListNode curr = head;
		ListNode n = head.next;
		while (n != null) {
			curr.next = prev;
			prev = curr;
			curr = n;
			n = n.next;
		}
		curr.next = prev;
		// new head is curr
		return curr;
    }
}