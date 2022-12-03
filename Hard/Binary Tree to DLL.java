/*
Given a Binary Tree (BT), convert it to a Doubly Linked List(DLL) In-Place. The left and right pointers in nodes are to be used as previous and next pointers respectively in converted DLL. The order of nodes in DLL must be same as Inorder of the given Binary Tree. The first node of Inorder traversal (leftmost node in BT) must be the head node of the DLL.

TreeToList

Example 1:

Input:
      1
    /  \
   3    2
Output:
3 1 2 
2 1 3 
Explanation: DLL would be 3<=>1<=>2
Example 2:

Input:
       10
      /   \
     20   30
   /   \
  40   60
Output:
40 20 60 10 30 
30 10 60 20 40
Explanation:  DLL would be 
40<=>20<=>60<=>10<=>30.
*/

class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    
    //Global Variables, Since it has been sharing by two methods
    Node head = null;
    Node prev = null;
    
    //Converting Function
    void convert(Node root)
    {
        //If we reached end of tree by Inorder Traversal, return
        if(root==null)return;
        
        //Inorder Traversal(for Sorted Output)
        convert(root.left);
        //if prev is null, then it is first node detected, so point head there
        if(prev == null)
            head = root;
            
        //Else Make a double Connection between current node and previous node    
        else
        {
            //current node's left should be previous
            root.left = prev;
            //previous's right should be current node
            prev.right = root;
        }
        //current node should be updated as previous for next recursive call...
        prev = root;
        convert(root.right);
            
    }
    Node bToDLL(Node root)
    {
	    //if no tree is given return null(initailly head is null)
	    if(root==null)return head;
	    
	    //else convert tree to LL and return the head
	    convert(root);
	    return head;
	    
	    //Time Complexity : o(n) for travelling the tree once
	    //Space Complexity : o(n) based on size of tree, DLL size will differ
    }
}
