/*
Given a link list of size N, modify the list such that all the even numbers appear before all the odd numbers in the modified list. The order of appearance of numbers within each segregation should be same as that in the original list.

NOTE: Don't create a new linked list, instead rearrange the provided one.


Example 1:

Input: 
N = 7
Link List:
17 -> 15 -> 8 -> 9 -> 2 -> 4 -> 6 -> NULL

Output: 8 2 4 6 17 15 9

Explaination: 8,2,4,6 are the even numbers 
so they appear first and 17,15,9 are odd 
numbers that appear later.

Example 2:

Input:
N = 4
Link List:
1 -> 3 -> 5 -> 7

Output: 1 3 5 7

Explaination: There is no even number. 
So ne need for modification.

*/


class Solution{
    Node divide(int N, Node head){
        Node fe,le,fo,lo,temp;
        fe = le = fo = lo = null;
        temp = head;
        
        while(temp!=null)
        {
            if(temp.data%2 == 0)
            {
                if(fe==null)
                {
                    fe = le = temp;
                }
                else
                {
                    le.next = temp;
                    le=temp;
                }
            }
            else
            {
                if(fo==null)
                {
                    fo = lo = temp;
                }
                else
                {
                    lo.next = temp;
                    lo=temp;
                }
            }
            temp = temp.next;
        }
        
        if(fe==null || fo==null)return head;
        
        head = fe;
        le.next=fo;
        lo.next=null;
        
        return head;
        // code here
        
        //Time Complexity: o(n)
        //Space Complexity : o(1)
    }
}
