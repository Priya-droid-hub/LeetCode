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
    private ListNode reverseLinkedList(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        return prev;
    }
    private ListNode getKthNode(ListNode head , int k){
        k -= 1;
        while(head != null && k > 0){
            k--;
            head = head.next;
        }
        return head;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null;
        

        while(temp != null){
            ListNode kthNode = getKthNode(temp , k);

            if(kthNode == null){
                if(prevLast != null){
                    prevLast.next = temp;
                }
                break;
            }

            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            reverseLinkedList(temp);

            if(temp == head){
                head = kthNode;
            }else{
                prevLast.next = kthNode;
            }
            
            prevLast = temp;
            temp = nextNode;
        }

        return head;
    }
}