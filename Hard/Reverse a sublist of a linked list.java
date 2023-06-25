/*
Given a linked list and positions m and n. Reverse the linked list from position m to n.

Example 1:

Input :
N = 10
Linked List = 1->7->5->3->9->8->10
                      ->2->2->5->NULL
m = 1, n = 8
Output : 2 10 8 9 3 5 7 1 2 5 
Explanation :
The nodes from position 1 to 8 
are reversed, resulting in 
2 10 8 9 3 5 7 1 2 5.
*/
class Solution
{
    public static Node reverseBetween(Node head, int left, int right){
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        
        //placing prev in its position
        for(int i=0; i<left-1; i++){
            prev = prev.next;
        }
        
        Node curr = prev.next;
        
        for(int i=0; i<right - left; i++){
            Node forw = curr.next;
            //interchanging the elements
            curr.next = forw.next;
            forw.next = prev.next;
            prev.next = forw;
        }
        return dummy.next;
    }
}
