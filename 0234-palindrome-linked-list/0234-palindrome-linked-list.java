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
        Stack<Integer> st = new Stack<>();

        ListNode temp = head;
        //traverse to store the data in the stack
        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }

        //check both r same or not when pop from the stack
        temp = head;
        while(temp != null){
            if(temp.val != st.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
}