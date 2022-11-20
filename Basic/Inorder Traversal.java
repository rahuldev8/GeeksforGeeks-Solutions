/*
Given a Binary Tree, find the In-Order Traversal of it.

Example 1:

Input:
       1
     /  \
    3    2
Output: 3 1 2

*/

class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> li = new ArrayList<Integer>();
        
        travel(root, li);
        
        return li;
    }
    
    public static void travel(Node root, ArrayList<Integer> ans)
    {
        if(root==null) return;
        
        if(root.left!=null)travel(root.left,ans);
        ans.add(root.data);
        if(root.right!=null)travel(root.right,ans);
    }
 }
 //Time Complexity : o(n)
 //Space Complexity : o(n)
