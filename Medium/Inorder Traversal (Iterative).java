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
    ArrayList<Integer> inOrder(Node root)
    {
        //Arraylist to return
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        //Stack to push all nodes
        Stack<Node> st = new Stack<Node>();
        
        Node curr = root;
        //to traverse all nodes, till the stack becomes empty
        while(true)
        {
            //push the all left elements to stack, untill it's null
            if(curr!=null)
            {
                st.push(curr);
                curr = curr.left;
            }
            else
            {
                //If stack is empty break
                if(st.isEmpty())break;
                
                //Copy the top of stack to curr
                curr = st.peek();
                //Delete that element
                st.pop();
                //add curr's data to ans
                ans.add(curr.data);
                //start to visit right Nodes
                curr = curr.right;
            }
        }
        return ans;
    }//Time Complexity : o(n)
    //Space Complexity : o(n)
    
    
}
