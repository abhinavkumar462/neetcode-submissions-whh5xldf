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
    int getLength(ListNode head) {
    int count = 0;
    ListNode temp = head;

    while (temp != null) {
        count++;
        temp = temp.next;
    }

    return count;
}
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode pre=head;
        ListNode curr=head;
        int r=getLength(head);
        
        int t=r-n;
        int count=0;
        if(r==1){head=null;
            return head;}
        if(r==2){
            if(n==1){head.next=null;
            return head;}
            if(n==2){head=head.next;
            return head;}
        }
        if(r==n){head=head.next;
            return head;}

        while(count!=t){
            pre=curr;
            curr=curr.next;
            count=count+1;

        }
        pre.next=curr.next;
        return head;

    }
}
