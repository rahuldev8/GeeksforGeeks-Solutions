/*
Given a linked list of N nodes. The task is to reverse this list.

Example 1:

Input:
LinkedList: 1->2->3->4->5->6
Output: 6 5 4 3 2 1
Explanation: After reversing the list, 
elements are 6->5->4->3->2->1.

*/

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
 //Time Complexity : o(n)
        //Space Complexity : o(1)
