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
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // 2. DUMMY NODE: This is our "anchor" so we don't crash on the first node
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        // 3. COMPARE: Only run while BOTH lists have nodes
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }

        // 4. CLEANUP: Attach the remainder of whichever list is left
        // We don't need a loop here; just point to the rest of the chain
        if (list1 != null) {
            head.next = list1;
        } else {
            head.next = list2;
        }

        // dummy.next is the actual start of our merged list
        return dummy.next;
    }
}