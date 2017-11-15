/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode temp = null;
        ListNode newNode = null;
        
        while(head!=null){
            newNode = head.next;
            head.next = temp;
            temp = head;
            head = newNode;  
        }
        
        return temp;
    }
}