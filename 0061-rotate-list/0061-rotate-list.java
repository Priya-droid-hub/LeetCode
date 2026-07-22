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
    private ListNode findNewLastNode(ListNode head , int k){
        ListNode temp = head;
        int cnt = 1;

        while(temp != null){
            if(cnt == k){
                return temp;
            }
            cnt++;
            temp = temp.next;
        }

        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        //length and tail
        int n = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        //reduce k
        k = k % n;
        if (k == 0) {
            return head;
        }

        // make circular
        tail.next = head;

        //newLastNode

        ListNode newLastNode = findNewLastNode(head , n - k);

        head = newLastNode.next;
        newLastNode.next = null;

        return head;
    }
}