/*
Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.

Example 1:

Input:
N = 8
value[] = {1,2,2,1,2,0,2,2}
Output: 0 1 1 2 2 2 2 2
Explanation: All the 0s are segregated
to the left end of the linked list,
2s to the right end of the list, and
1s in between.
Example 2:

Input:
N = 4
value[] = {2,2,0,1}
Output: 0 1 2 2
Explanation: After arranging all the
0s,1s and 2s in the given format,
the output will be 0 1 2 2.

*/

class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        if(head==null || head.next == null)return head;
        
        //Taking Count of all zeros, ones and twos
        int zero = 0;
        int one = 0;
        int two = 0;
        
        Node temp = head;
        
        //populating count values
        while(temp!=null)
        {
            if(temp.data==0)zero++;
            else if(temp.data==1)one++;
            else two++;
            
            temp = temp.next;
        }
        
        //start to traverse from head again
        temp = head;
        
        //fill first zero places(zero count, that present in given list), with value 0
        while(zero-->0)
        {
            temp.data = 0;
            temp = temp.next;
        }
        
        //fills with 1
        while(one-->0)
        {
            temp.data = 1;
            temp = temp.next;
        }
        //fills with 2
        while(two-->0)
        {
            temp.data = 2;
            temp = temp.next;
        }
        
        return head;
            
            //Time Complexity: o(n)
            //Space Complexity: o(1)
    }
}

