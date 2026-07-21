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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null)   return head;
        ListNode lessNodes = new ListNode(-1);
        ListNode greaterNodes = new ListNode(-1);

        ListNode less = lessNodes;
        ListNode greater = greaterNodes;

        ListNode temp = head;

        while(temp != null){
            if(temp.val < x){
                less.next = temp;
                less = temp;
            }else if(temp.val >= x){
                greater.next = temp;
                greater = temp;
            }
            temp = temp.next;
        }
        greater.next = null;
        less.next = greaterNodes.next;
       
        return lessNodes.next;

    }
}