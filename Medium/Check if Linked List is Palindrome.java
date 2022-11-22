/*
Given a singly linked list of size N of integers. The task is to check if the given linked list is palindrome or not.

Example 1:

Input:
N = 3
value[] = {1,2,1}
Output: 1
Explanation: The given linked list is
1 2 1 , which is a palindrome and
Hence, the output is 1.
Example 2:

Input:
N = 4
value[] = {1,2,3,4}
Output: 0
Explanation: The given linked list
is 1 2 3 4 , which is not a palindrome
and Hence, the output is 0.
*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Stack<Integer> st = new Stack<Integer>();
        Node temp = head;
        
        //pushing all elements to stack
        while(temp!=null)
        {
            st.push(temp.data);
            temp = temp.next;
        }
        
        temp = head;
        
        //checking the list and stack in same time
        while(temp!=null)
        {
            //if data, mismatches then it is not palindrome, return false
            if(temp.data != st.peek())return false;
            
            else
            {
                //if matches move to next element comparison
                st.pop();
                temp = temp.next;
            }
        }
        
        //if all matches, return true
        return true;
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
    }    
}
