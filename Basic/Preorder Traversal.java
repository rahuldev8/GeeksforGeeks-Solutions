/*
Given a binary tree, find its preorder traversal.

Example 1:

Input:
        1      
      /          
    4    
  /    \   
4       2
Output: 1 4 4 2 
Example 2:

Input:
       6
     /   \
    3     2
     \   / 
      1 2
Output: 6 3 1 2 2 

*/


class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    
    static void travel(Node root ,ArrayList<Integer>ar)
    {
        if(root==null)return;
        
        ar.add(root.data);
        if(root.left!=null)travel(root.left, ar);
        if(root.right!=null)travel(root.right, ar);
    }
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> ar = new ArrayList<>();
        if(root==null) return ar;
        
        travel(root, ar);
        
        return ar;
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
    }

}
