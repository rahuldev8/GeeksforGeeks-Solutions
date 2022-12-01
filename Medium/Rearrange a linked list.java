/*
Given a singly linked list, the task is to rearrange it in a way that all odd position nodes are together and all even positions node are together.
Assume the first element to be at position 1 followed by second element at position 2 and so on.
Note: You should place all odd positioned nodes first and then the even positioned ones. (considering 1 based indexing). Also, the relative order of odd positioned nodes and even positioned nodes should be maintained.

Example 1:

Input:
LinkedList: 1->2->3->4
Output: 1 3 2 4 
Explanation: 
Odd elements are 1, 3 and even elements are 
2, 4. Hence, resultant linked list is 
1->3->2->4.
Example 2:

Input:
LinkedList: 1->2->3->4->5
Output: 1 3 5 2 4 
Explanation: 
Odd elements are 1, 3, 5 and even elements are
2, 4. Hence, resultant linked list is
1->3->5->2->4.

*/

class Solution
{

   // Should rearrange given linked list such that all even
   // positioned Nodes are before odd positioned.
   // Returns nothing
    void rearrangeEvenOdd(Node head)
    {
          //  The task is to complete this method
          
          //Arraning the list in form of odds are first and evens at last
          Node fo,lo,fe,le,temp;
          fo = lo = fe = le = null;
          temp = head;
          
          //current index is 1
          int index = 1;
          while(temp!=null)
          {
              if(index%2!=0)
              {
                  if(fo==null)fo=lo=temp;
                  else
                  {
                      lo.next = temp;
                      lo = temp;  
                  }
              }
              else
              {
                  if(fe==null)fe=le=temp;
                  else
                  {
                      le.next = temp;
                      le = temp;
                  }
              }
              //incrementing the index count
              index++;
              temp = temp.next;
          }
          //linking the lists
          
          if(fo==null)head = fe;
          else if(fe==null)head = fo;
          else
          {
            head = fo;
            lo.next = fe;
            le.next = null;   
          }
          //Time Complexity : o(n)
          //Space Complexity : o(1)
     }
}
