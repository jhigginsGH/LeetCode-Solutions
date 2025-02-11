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
class MergeLinkedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0); //Create dummy head node
        ListNode tail = head; //Create pointer to end of list

        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                tail.next = list1; //Attach list1 node to end of the merged list
                list1 = list1.next; //Remove head node from list1
            }
            else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;//Advance tail pointer to node at the end of the list
        }

        //After one list has been exhausted, merge the rest of the last list
        while (list1 != null){
            tail.next = list1;
            tail = tail.next;
            list1 = list1.next;
        }
        while (list2 != null){
            tail.next = list2;
            tail = tail.next;
            list2 = list2.next;
        }
        return head.next; //Skip the dummy node created at the beginning and return the first node
    }
}