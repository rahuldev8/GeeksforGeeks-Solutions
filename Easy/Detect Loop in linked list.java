/*
Given a linked list of N nodes. The task is to check if the linked list has a loop. Linked list can contain self loop.

Example 1:

Input:
N = 3
value[] = {1,3,4}
x(position at which tail is connected) = 2
Output: True
Explanation: In above test case N = 3.
The linked list with nodes N = 3 is
given. Then value of x=2 is given which
means last node is connected with xth
node of linked list. Therefore, there
exists a loop.
Example 2:

Input:
N = 4
value[] = {1,8,3,4}
x = 0
Output: False
Explanation: For N = 4 ,x = 0 means
then lastNode->next = NULL, then
the Linked list does not contains
any loop.

*/

class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        if(head==null)return false;
        Node slow = head;
        Node fast = head;
        
        //if there is next node, move fast once
        while(fast!=null)
        {
            fast = fast.next;
            //If there is next node, move fast and slow once
            if(fast!=null)
            {
                fast = fast.next;
                slow = slow.next;
            }
            //if they met, loop detected
            if(fast == slow) return true;
        }
        
        return false;
    }
    //Time Complexity : o(n)
    //Space Complexity : o(1)
}
