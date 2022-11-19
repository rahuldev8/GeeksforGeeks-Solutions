/*
Given a singly linked list and a key, count the number of occurrences of given key in the linked list.

Example 1:

Input:
N = 7
Link List = 1->2->1->2->1->3->1
search_for = 1
Output: 4
Explanation:1 appears 4 times.
*/

class Solution
{
    public static int count(Node head, int x)
    {
        //code here
        int count = 0;
        while(head!=null)
        {
            if(head.data == x)count++;
            head = head.next;
        }
        return count;
    }
    //Time Complexity : o(n)
    //Space Complexity : o(1)
}

//Time Complexity : o(n)
//Space Complexity : o(1)
