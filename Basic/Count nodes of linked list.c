/*
Given a singly linked list. The task is to find the length of the linked list, where length is defined as the number of nodes in the linked list.

Example 1:

Input:
LinkedList: 1->2->3->4->5
Output: 5
Explanation: Count of nodes in the 
linked list is 5, which is its length.*/

int getCount(struct Node* head)
    {
        int count=0;
        struct Node* th = head;
        while(th!=NULL)
        {
            th=th->next;
            count++;
        }
        return count;
    }

//Time Complexity: o(n)
//Space Complexity : o(1)
