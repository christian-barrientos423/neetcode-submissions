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
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            // 1. Save the next node (so we don't lose the rest of the list)
            ListNode nextTemp = curr.next;
            
            // 2. Reverse the pointer
            curr.next = prev;
            
            // 3. Move the 'prev' and 'curr' pointers one step forward
            prev = curr;
            curr = nextTemp;
        }

        // After the loop, 'prev' will be pointing to the new head
        return prev;
    }
}
