/*
Given a linked list of N nodes. The task is to reverse this list.

Example 1:

Input:
LinkedList: 1->2->3->4->5->6
Output: 6 5 4 3 2 1
Explanation: After reversing the list, 
elements are 6->5->4->3->2->1.

*/

struct Node* reverseList(struct Node *head)
    {
        typedef struct Node Node;
        
        Node* prev = NULL;
        Node* curr = head;
        Node* next = NULL;
        
        while(curr != NULL)
        {
            next=curr->next;
            curr->next=prev;
            
            prev = curr;
            curr = next;
        }
        return prev;
        
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
