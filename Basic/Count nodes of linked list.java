/*
Given a singly linked list. The task is to find the length of the linked list, where length is defined as the number of nodes in the linked list.

Example 1:

Input:
LinkedList: 1->2->3->4->5
Output: 5
Explanation: Count of nodes in the 
linked list is 5, which is its length.*/
class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        //Code here
        int count = 0;
        while(head!=null)
        {
            count++;
            head = head.next;
        }
        return count;
    }
    //Time Complexity : o(n)
    //Space Complexity : o(1)
}

