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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0); // Create dummy node to use a previous node to head
        dummy.next = head;
        ListNode temp = head;
        ListNode prev = dummy;

        while (temp != null){
            if (temp.val == val){
                prev.next = temp.next; // Update previous nodes next pointer to skip nodes that contain val
            }
            else{
                prev = temp; // Only update when a node is not skipped because when a node is skipped the previous node stays the same
            }
            temp = temp.next; // Advance to next node
        }
        return dummy.next; // Important to return dummy.next rather than head because if head contained val it would have been removed from the list
    }
}
