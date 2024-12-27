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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode start = l1;
        int sum = 0;
        while(l1 != null || l2 != null){
            if(l1 != null){ //if we have a value add it to sum
                sum += l1.val;
            } 
            if(l2 != null){ //same as above
                sum += l2.val;
            }
            l1.val = sum%10;
            sum /= 10;
            if(l1.next == null && ((l2 != null && l2.next != null) || sum != 0)){
                //checks if we have a carryover or the other linked list has more values
                l1.next = new ListNode(0);
            }
            if(l1 != null) 
                l1 = l1.next;
            if(l2 != null) // we have to check since one of them might be longer
                l2 = l2.next;
        }

        return start;
    }
}