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

void display(struct Node *head)
{
   //add code here
   struct Node* th = head;
   while(th!=NULL)
   {
       printf("%d ",th->data);
       th=th->next;
   }
}

//Time Complexity : o(n)
//Space Complexity : o(1)
