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
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        ListNode curr = head;
        ListNode prev = null;
        int endindex = length - n;
        int i = 0;
        while (i < endindex) {
            prev = curr;
            curr = curr.next;
            i++;
        }
        ListNode next = curr.next;
        if (prev != null) {
            prev.next = next;
        } else {
            head = next;
        }
        return head;
    }
}
