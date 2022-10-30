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
    public:
    int count(struct node* head, int target)
    {
    //add your code here
    int ans=0;
    struct node* th = head;
    while(th!=NULL)
    {
        if(th->data == target)ans++;
        th=th->next;
    }
    return ans;
    }
};

//Time Complexity : o(n)
//Space Complexity : o(1)
