/*
Given a binary tree. Find the inorder traversal of the tree without using recursion.

Example 1

Input:
           1
         /    \
       2       3
      /   \
    4     5
Output: 4 2 5 1 3
Explanation:
Inorder traversal (Left->Root->Right) of 
the tree is 4 2 5 1 3.
Example 2

Input:
            8
          /   \
            1      5
             \    /  \
             7   10   6
             \  /
          10 6
Output: 1 7 10 8 6 10 5 6
Explanation:
Inorder traversal (Left->Root->Right) 
of the tree is 1 7 10 8 6 10 5 6.

*/

class Solution
{
    // Return a list containing the inorder traversal of the given tree
    
    //Morris Inorder traversal
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Node curr = root;
        
        while(curr!=null)
        {
            //case 1 : if there is no left part for the tree
            if(curr.left==null)
            {
                ans.add(curr.data);
                curr= curr.right;
            }
            else
            {
                Node thread = curr.left;
                while(thread.right != null && thread.right != curr)
                    thread = thread.right;
                
                //case 2 : if left sub tree's right most element's right is null    
                if(thread.right == null)
                {
                    thread.right = curr;
                    curr = curr.left;
                }
                //case 3 : if left subtree's right most element's right is pointing to curr
                //Means the thread is already present
                else
                {
                    thread.right = null;
                    ans.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        
        return ans;
        
        //Time Complexity : o(n)
        //Space Complexity : o(n) -> arraylist is taking n space, but for actual tree traversal space
        //                             is only o(1), ADVANTAGE OF USING MORRIS TRAVERSAL
    }
    
    
}
