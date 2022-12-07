/*
Given a binary tree. Find the preorder traversal of the tree without using recursion.


Example 1:

Input:
           1
         /   \
        2     3
      /  \
     4    5
Output: 1 2 4 5 3
Explanation:
Preorder traversal (Root->Left->Right) of 
the tree is 1 2 4 5 3.
Example 2

Input:
            8
          /   \
         1      5
          \    /  \
           7  10   6
            \  /
            10 6
Output: 8 1 7 10 5 10 6 6 
Explanation:
Preorder traversal (Root->Left->Right) 
of the tree is 8 1 7 10 5 10 6 6.

*/

class Tree
{
    //MORRIS Preorder Traversal
    ArrayList<Integer> preOrder(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Node curr = root;
        
        while(curr!=null)
        {
            //case 1 : if there is no left subtree for given root
            if(curr.left == null)
            {
                ans.add(curr.data);
                curr = curr.right;
            }
            //else there is a subtree
            else
            {
                Node thread = curr.left;
                while(thread.right != null && thread.right != curr)
                    thread = thread.right;
                    
                //case 2 : if leftsubtre's right most node's right is null
                if(thread.right == null)
                {
                    //In preorder process the root, while making the thread itself
                    thread.right = curr;
                    ans.add(curr.data);
                    curr = curr.left;
                }
                //case 3 : if leftsubtree's right most node's right is pointing to curr
                // Means thread is already present
                else
                {
                    thread.right = null;
                    curr = curr. right;
                }
            }
        }
        
        return ans;
        //Time Complexity : o(n)
        //Space Complexity : o(n) -> arraylist is taking n space, but for actual tree traversal space
        //                             is only o(1), ADVANTAGE OF USING MORRIS TRAVERSAL
    }
    
    
}
