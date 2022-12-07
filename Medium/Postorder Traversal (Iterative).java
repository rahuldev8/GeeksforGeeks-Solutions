/*
Given a binary tree. Find the postorder traversal of the tree without using recursion.

Example 1

Input:
           1
         /   \
        2     3
      /  \
     4    5

Output: 4 5 2 3 1
Explanation:
Postorder traversal (Left->Right->Root) of 
the tree is 4 5 2 3 1.
Example 2

Input:
             8
          /      \
        1          5
         \       /   \
          7     10    6
           \   /
            10 6

Output: 10 7 1 6 10 6 5 8 
Explanation:
Inorder traversal (Left->Right->Root) 
of the tree is 10 7 1 6 10 6 5 8 .
*/

class Tree {
    
    //Morris Post Order Traversal : Symmetric of Pre Order
    ArrayList<Integer> postOrder(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        Node curr = node;
        //Same as preorder
        //left will be replaced with right and vice versa..
        //While inserting always insert in first index (0)
        while(curr!=null)
        {
            //case 1 : if there is no right subtree for given root
            if(curr.right == null)
            {
                ans.add(0, curr.data);
                curr = curr.left;
            }
            else
            {
                Node thread = curr.right;
                while(thread.left != null && thread.left != curr)
                    thread = thread.left;
                    
                //case 2 : if rightsubtree's left most element is pointing to null
                if(thread.left == null)
                {
                    thread.left = curr;
                    ans.add(0, curr.data);
                    curr = curr.right;
                }
                //case 3 : if rightsubtree's left most node is pointing to curr (Thread is Already Present)
                else
                {
                    thread.left = null;
                    curr = curr.left;
                }
            }
        }
        
        return ans;
        //Time Complexity : o(n)
        //Space Complexity : o(n) -> arraylist is taking n space, but for actual tree traversal space
        //                             is only o(1), ADVANTAGE OF USING MORRIS TRAVERSAL
    }
}
