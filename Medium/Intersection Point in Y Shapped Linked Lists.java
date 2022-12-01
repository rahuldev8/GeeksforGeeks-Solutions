/*
Given two singly linked lists of size N and M, write a program to get the point where two linked lists intersect each other.

 

Example 1:

Input:
LinkList1 = 3->6->9->common
LinkList2 = 10->common
common = 15->30->NULL
Output: 15
Explanation:
Y ShapedLinked List
Example 2:

Input: 
Linked List 1 = 4->1->common
Linked List 2 = 5->6->1->common
common = 8->4->5->NULL
Output: 8
Explanation: 

4              5
|              |
1              6
 \             /
  8   -----  1 
   |
   4
   |
  5
  |
  NULL 
  
  */

class Intersect
{
    int GetLength(Node head)
    {
        int len = 1;
        while(head!=null)
        {
            head = head.next;
            len++;
        }
        
        return len;
    }
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{   
	    //Getting Length of each list
	    int len1 = GetLength(head1);
	    int len2 = GetLength(head2);
	    
	    //Pointing head of two list, at same distance from intersection point
	    while(len1>len2)
	    {
	        head1 = head1.next;
	        len1--;
	    }
	    while(len1<len2)
	    {
	        head2 = head2.next;
	        len2--;
	    }
	    
	    //after reaching the same distance
	    
	    //process them, till they meet each other
	    while(head1!=head2)
	    {
	        head1 = head1.next;
	        head2 = head2.next;
	    }
	    //if meets returns the data of intersection point
	    return head1.data;
	    
	    //Time Complexity : o(n)
	    //SPace Complexity : o(1)
	}
}
