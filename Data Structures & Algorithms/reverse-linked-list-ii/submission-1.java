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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        ListNode prev = null;
        int i = 1;
        while (i < left) {
            prev = curr;
            curr = curr.next;
            i++;
        }
        ListNode startprev = prev;
        ListNode start = curr;
        i = 1;
        while (i <= right -left +1) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }
        start.next = curr;
        if(startprev!=null){
            startprev.next = prev;
        }else{
            return prev;
        }
        return head;
    }
}