/*
Given two sorted linked lists consisting of N and M nodes respectively. The task is to merge both of the list (in-place) and return head of the merged list.
 

Example 1:

Input:
N = 4, M = 3 
valueN[] = {5,10,15,40}
valueM[] = {2,3,20}
Output: 2 3 5 10 15 20 40
Explanation: After merging the two linked
lists, we have merged list as 2, 3, 5,
10, 15, 20, 40.
Example 2:

Input:
N = 2, M = 2
valueN[] = {1,1}
valueM[] = {2,4}
Output:1 1 2 4
Explanation: After merging the given two
linked list , we have 1, 1, 2, 4 as
output.
*/

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node a = head1;
     Node b = head2;
     Node head = null;
     Node tail = null;
     
     if(a==null)return b;
     if(b==null)return a;
     
     if(a.data<b.data)
     {
        head = a;
        tail = a;
        a = a.next;
     }
     else
     {
         head = b;
         tail = b;
         b = b.next;
     }
     
     while(a!=null && b!=null)
     {
         if(a.data<b.data)
         {
            tail.next = a;
            tail = a;
            a = a.next;
        }
        else
        {
            tail.next = b;
            tail = b;
            b = b.next;
        }
     }
     if(a==null)tail.next=b;
     if(b==null)tail.next=a;
     
     return head;
   } 
   
   //Time Complexity : o(n)
   //Space Complexity : o(1)
}
