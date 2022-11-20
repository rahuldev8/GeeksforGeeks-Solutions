/*
Lamp
This problem is part of GFG SDE Sheet. Click here to view more.  

Given two binary trees, the task is to find if both of them are identical or not. 


Example 2:

Input:
     1          1
   /   \      /   \
  2     3    2     3
Output: Yes
Explanation: There are two trees both
having 3 nodes and 2 edges, both trees
are identical having the root as 1,
left child of 1 is 2 and right child
of 1 is 3.
Example 2:

Input:
    1       1
  /  \     /  \
 2    3   3    2
Output: No
Explanation: There are two trees both
having 3 nodes and 2 edges, but both
trees are not identical.
*/


class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node fast = head;//moves 2 nodes per iteration
         Node slow = head;//moves 1 node per iteration
         
         while(fast!=null)
         {
             fast = fast.next;
             if(fast!=null)
             {
                 fast = fast.next;
                 slow = slow.next;
             }
         }
         //if fast is null, then slow will be in list's middle, then return the data in slow pointer
         return slow.data;
         
         //Time Complexity : o(n)
         //Space Complexity : o(1)
    }
}
