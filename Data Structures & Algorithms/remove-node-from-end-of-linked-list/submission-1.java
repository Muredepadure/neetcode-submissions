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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode current = head;
        int size = 0;
        while(current != null) {
            size++;
            current = current.next;
        }

        int index = size - n; //2
        if(index == 0) return head.next;

        current = head;
        while(current != null) {
            if(index == 1){
                if(current.next != null){
                    current.next = current.next.next;
                }else{
                    current.next = null;
                }
                break;
            }
            index--;
            current = current.next;
        }
        return head;
    }
}
