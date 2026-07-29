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
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        if(cnt==n){
            return head.next;
        }
        int p=(cnt-n)+1;
        cnt=1;
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            cnt++;
            prev=curr;
            curr=curr.next;
            if(cnt==p){
                prev.next=curr.next;
            }
        }
        return head;
    }
}