/*
Given a singly linked list: A0→A1→...→An-2→An-1, reorder it to: A0→An-1→A1→An-2→A2→An-3→...
For example: Given 1->2->3->4->5 its reorder is 1->5->2->4->3.

Note: It is recommended do this in-place without altering the node's values.

Example 1:

Input:
LinkedList: 1->2->3
Output: 1 3 2
Explanation:
Here n=3, so the correct
order is A0→A2→A1
Example 2:

Input:
Explanation: 1->7->3->4
Output: 1 4 7 3
Explanation:
Here n=4, so the correct
order is A0→A3→A1→A2

*/

class Solution {
    //List Reverse
    Node reverse(Node head)
    {
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
    Node reorderlist(Node head) {
        //Step 1 : Find Middle of List
        Node slow = head;
        Node fast = head;
        
        while(fast!=null)
        {
            fast = fast.next;
            if(fast!=null)
            {
                fast = fast.next;
                slow = slow.next;
            }
        }
        //ans head to return
        Node ans = head;
        //First list
        Node first = head;
        //Step 2: Second list
        Node second = reverse(slow.next);
        slow.next = null;
        
        //Step 3: binding two lists
        //if given list is size is even then size of first and second list will be same,
        //if it is odd the size of secong will be smaller
        while(second!=null)
        {
            //temp to store remaining list, which not meant to be lost
            Node temp1 = first.next;
            Node temp2 = second.next;
            
            //Binding two lists
            first.next = second;
            second.next = temp1;
            
            //Moving for next set of elements
            first = temp1;
            second = temp2;
            
        }
        
        return ans;
    }
    //Time Complexity : o(n)
    //Space Complexity : o(1)
}
