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
        ListNode lx=new ListNode(-1);
        ListNode lt=lx;
        ListNode gx=new ListNode(-1);
        ListNode gt=gx;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                lt.next=temp;
                lt=lt.next;
            }else{
                gt.next=temp;
                gt=gt.next;
            }
            temp=temp.next;
        }
        head= (lx.next!=null) ? lx.next: gx.next;
        lt.next=gx.next;
        gt.next=null;
        return head;
    }
}