/*
Given a linked list consisting of L nodes and given a number N. The task is to find the Nth node from the end of the linked list.

Example 1:

Input:
N = 2
LinkedList: 1->2->3->4->5->6->7->8->9
Output: 8
Explanation: In the first example, there
are 9 nodes in linked list and we need
to find 2nd node from end. 2nd node
from end is 8.  
Example 2:

Input:
N = 5
LinkedList: 10->5->100->5
Output: -1
Explanation: In the second example, there
are 4 nodes in the linked list and we
need to find 5th from the end. Since 'n'
is more than the number of nodes in the
linked list, the output is -1.

*/

class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	Node p1 = head;
    	Node p2 = head;
    	Node temp = head;
    	
    	//if position is greater than list size
    	int nodes = 0;
    	while(temp!=null)
    	{
    	    nodes++;
    	    temp=temp.next;
    	}
    	if(n>nodes)return -1;
    	
    	//First pointer to move to nth position
    	while(n>0)
    	{
    	    p1=p1.next;
    	    n--;
    	}
    	//cuncurrently moving two pointers, such that p2 will pointer to target position
    	while(p1!=null)
    	{
    	    p1=p1.next;
    	    p2=p2.next;
    	}
    	
    	//return value in target position
    	return p2.data;
    }
    //Time Complexity : o(n)
    //Space Complexity : o(1)
}
