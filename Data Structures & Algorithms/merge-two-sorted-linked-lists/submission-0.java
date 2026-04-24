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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        LinkedList<Integer> list3 = new LinkedList<>();
        

        while(!(list1==null||list2==null)){
            if(list1.val<=list2.val){
                list3.add(list1.val);
                list1=list1.next;
            }else{list3.add(list2.val);
                list2=list2.next;}

        }if(list1==null){
            while(!(list2==null)){
                list3.add(list2.val);
                list2=list2.next;
            }
        }else{while(!(list1==null)){
                list3.add(list1.val);
                list1=list1.next;
            }}

            ListNode head = null;
ListNode tail = null;

for (int num : list3) {
    ListNode newNode = new ListNode(num);

    if (head == null) {
        head = newNode;
        tail = newNode;
    } else {
        tail.next = newNode;
        tail = newNode;
    }
}

     return head;   
    }
}