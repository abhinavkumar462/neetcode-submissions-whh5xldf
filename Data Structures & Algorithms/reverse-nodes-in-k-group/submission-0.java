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
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1) return head;

        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (curr != null) {

            int count = 0;
            ListNode temp = curr;

            // Step 1: check if k nodes exist
            while (temp != null && count < k) {
                stack.push(temp);
                temp = temp.next;
                count++;
            }

            // If less than k nodes → attach as it is
            if (count < k) {
                tail.next = curr;
                return dummy.next;
            }

            // Step 2: pop and reverse
            while (!stack.isEmpty()) {
                tail.next = stack.pop();
                tail = tail.next;
            }

            // Move curr forward
            curr = temp;
        }

        // Important: end the list
        tail.next = null;

        return dummy.next;
    }
}