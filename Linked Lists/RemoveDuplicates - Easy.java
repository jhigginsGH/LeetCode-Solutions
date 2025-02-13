/**
 * Question:
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head); // Dummy always points to head node
        ListNode prev = dummy; // Keeps track of last processed node

        while (head != null){
            if (dummy.val == head.val){
                dummy.val += 1; // Dont allow dummy node to match nodes.
            }
            if (head.val == prev.val){
                prev.next = head.next; // Update pointer of previous node to skip duplicate node
            }
            else{
                prev = head; // Only need to update previous node if we do not skip over a node because if we skip the previous node will be the same
            }
            head = head.next; // Advance to next node in the list
        }
        return dummy.next; // Returns true head of the list
    }
}