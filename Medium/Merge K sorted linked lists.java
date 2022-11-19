/*
Given K sorted linked lists of different sizes. The task is to merge them in such a way that after merging they will be a single sorted linked list.

Example 1:

Input:
K = 4
value = {{1,2,3},{4 5},{5 6},{7,8}}
Output: 1 2 3 4 5 5 6 7 8
Explanation:
The test case has 4 sorted linked 
list of size 3, 2, 2, 2
1st    list     1 -> 2-> 3
2nd   list      4->5
3rd    list      5->6
4th    list      7->8
The merged list will be
1->2->3->4->5->5->6->7->8.
Example 2:

Input:
K = 3
value = {{1,3},{4,5,6},{8}}
Output: 1 3 4 5 6 8
Explanation:
The test case has 3 sorted linked
list of size 2, 3, 1.
1st list 1 -> 3
2nd list 4 -> 5 -> 6
3rd list 8
The merged list will be
1->3->4->5->6->8.

*/

class Solution
{
    //Function to merge K sorted linked list.
    //Logic for merging two sorted linked list
    Node mergetwolist(Node head1, Node head2)
    {
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
    
    Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.
        Node ans = null;
        //Taking pair of sorted linked list and merging them, Storing their start point(head)
        //in ans reference variable
        for(Node i : arr)
        {
            ans = mergetwolist(i,ans);
        }
        return ans;
    }
    //Time Complexity : o(n^2)
    //Space Complexity : o(1)
}
