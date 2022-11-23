/*
Given a singly linked list of size N. The task is to left-shift the linked list by k nodes, where k is a given positive integer smaller than or equal to length of the linked list.

Example 1:

Input:
N = 5
value[] = {2, 4, 7, 8, 9}
k = 3
Output: 8 9 2 4 7
Explanation:
Rotate 1: 4 -> 7 -> 8 -> 9 -> 2
Rotate 2: 7 -> 8 -> 9 -> 2 -> 4
Rotate 3: 8 -> 9 -> 2 -> 4 -> 7
Example 2:

Input:
N = 8
value[] = {1, 2, 3, 4, 5, 6, 7, 8}
k = 4
Output: 5 6 7 8 1 2 3 4

*/


class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        
        //Finding total Number of Nodes in given list
        Node curr = head;
        int nodes = 1;
        
        //IMPORTANT !!!, if nodes's next is null, don't go to there
        //simply break the loop, ans limk to head
        while(curr.next!=null)
        {
            nodes++;
            curr = curr.next;
        }
        
        //Making list as cyclic list
        curr.next = head;
        
        //Finding the poistion, to break the link
        k = k % nodes;
        
        //travelling to Kth position to break the link
        
        //curr = head; (Since, it is left shift, don't start ti count k from head, instead start from
        // last node)
        while(k>0)
        {
            curr = curr.next;
            k--;
        }
        
        //New head
        head = curr.next;
        //breaking the link
        curr.next = null;
        
        //Returning New head
        return head;
    }
    
    //Time Complexity : o(n)
    //Space Complexity : o(1)
}
