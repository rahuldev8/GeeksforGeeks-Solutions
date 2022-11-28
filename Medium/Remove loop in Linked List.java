/*
Given a linked list of N nodes such that it may contain a loop.

A loop here means that the last node of the link list is connected to the node at position X(1-based index). If the link list does not have any loop, X=0.

Remove the loop from the linked list, if it is present, i.e. unlink the last node which is forming the loop.

Example 1:

Input:
N = 3
value[] = {1,3,4}
X = 2
Output: 1
Explanation: The link list looks like
1 -> 3 -> 4
     ^    |
     |____|    
A loop is present. If you remove it 
successfully, the answer will be 1. 

Example 2:

Input:
N = 4
value[] = {1,8,3,4}
X = 0
Output: 1
Explanation: The Linked list does not 
contains any loop. 

Example 3:

Input:
N = 4
value[] = {1,2,3,4}
X = 1
Output: 1
Explanation: The link list looks like 
1 -> 2 -> 3 -> 4
     |_________|
A loop is present. 
If you remove it successfully, 
the answer will be 1. 
*/

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        
        //Slow fast Pointers Approach
        Node slow = head;
        Node fast = head;
        
        while(fast!=null)
        {
            //moving fast pointer by two nodes and slow pointer by one node
            fast = fast.next;
            if(fast!=null)
            {
                fast = fast.next;
                slow = slow.next;
            }
            
            //if they met, means loop detected
            if(fast==slow)
            {
                //reassinging head to slow
                slow = head;
                
                //if cycle is present in head pointer itself
                
                if(fast == slow)//new slow is pointing to head
                {
                    while(fast.next!=slow)fast = fast.next;
                }
                
                //else make fast pointer to revolve around the loop
                //make slow pointer to make a move each time towards the cycle
                
                //if next of both is same(fast is common for both cases)
                //make fast's next as null
                else
                {
                    while(fast.next!=slow.next)
                    {
                        fast = fast.next;
                        slow = slow.next;
                    }
                }
                fast.next = null;
            }
                
                //Time Complexity : o(n)
                //Space Complexity : o(1)
        }
    }
}

