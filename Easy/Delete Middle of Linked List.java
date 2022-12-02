/*
Given a singly linked list, delete middle of the linked list. For example, if given linked list is 1->2->3->4->5 then linked list should be modified to 1->2->4->5.
If there are even nodes, then there would be two middle nodes, we need to delete the second middle element. For example, if given linked list is 1->2->3->4->5->6 then it should be modified to 1->2->3->5->6.
If the input linked list is NULL or has 1 node, then it should return NULL

Example 1:

Input:
LinkedList: 1->2->3->4->5
Output: 1 2 4 5
Example 2:

Input:
LinkedList: 2->4->6->7->5->1
Output: 2 4 6 5 1

*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        
        Node fast = head;
        Node slow = head;
        
        while(fast!=null)
        {
            fast=fast.next;
            if(fast!=null)
            {
                fast = fast.next;
                slow = slow.next;
            }
        }
        //Slow points to middle of list
        //If list has less than two elements
        if(slow.next==null)
        {
            head.next=null;
            return head;
        }
        //Ignoring the slow's next node
          slow.data = slow.next.data;
          slow.next = slow.next.next;  
        return head;
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
