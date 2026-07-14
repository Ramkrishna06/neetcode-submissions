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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
      //finding mid
      ListNode slow = head; 
      ListNode fast = slow.next;
      while(fast != null && fast.next != null){
        slow = slow.next;
        fast= fast.next.next;
      }
      ListNode mid = slow;
      //Reverseing after mid list;
      ListNode curr = mid.next;
      mid.next = null;
      ListNode prev = null;
      while(curr!=null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
      }
      
      //traversing both node usig two pointer
      ListNode rightNode = prev;
      ListNode leftNode = head;

      while(rightNode!=null && leftNode!=null){
        ListNode LeftNext = leftNode.next;
        ListNode RightNext = rightNode.next;
        leftNode.next = rightNode;
        rightNode.next =LeftNext;
        leftNode = LeftNext;
        rightNode = RightNext;
        
      }     

    }
}
