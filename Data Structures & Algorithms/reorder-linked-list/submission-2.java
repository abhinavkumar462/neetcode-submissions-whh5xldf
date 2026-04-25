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
       
       Stack<Integer> stack = new Stack<>();
        //if(head.next==null){System.exit(0);}
       // if (head == null || head.next == null) {
    
//}
         ListNode curr=head.next;

        while(curr!=null){
        ListNode temp = curr;
        while (temp != null) {
        stack.push(temp.val);
        temp = temp.next;
}
        ListNode curr2=curr;    
        while(!stack.isEmpty()){
            curr2.val = stack.pop();
            curr2=curr2.next;
        }
        curr=curr.next;
        }

        //return 0;
        
    }
}
