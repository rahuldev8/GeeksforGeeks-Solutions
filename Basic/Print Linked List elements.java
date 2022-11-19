/*
Given a linked list. Print all the elements of the linked list.

Example 1:

Input:
N=2
LinkedList={1 , 2}
Output:
1 2
Explanation:
The linked list contains two 
elements 1 and 2.The elements 
are printed in a single line.
*/

class Solution
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void display(Node head)
    {
        //add code here.
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}

//Time Complexity : o(n)
//Space Complexity : o(1)
