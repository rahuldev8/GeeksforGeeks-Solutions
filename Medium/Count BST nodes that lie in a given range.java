/*
Given a Binary Search Tree (BST) and a range l-h(inclusive), count the number of nodes in the BST that lie in the given range.

The values smaller than root go to the left side
The values greater and equal to the root go to the right side
Example 1:

Input:
      10
     /  \
    5    50
   /    /  \
  1    40  100
l = 5, h = 45
Output: 3
Explanation: 5 10 40 are the node in the
range
Example 2:

Input:
     5
    /  \
   4    6
  /      \
 3        7
l = 2, h = 8
Output: 5
Explanation: All the nodes are in the
given range.

*/

class Solution
{
    //Function to count number of nodes in BST that lie in the given range.
    void help(Node root, int l, int h, ArrayList<Integer> ans)
    {
        if(root==null) return;
        
        help(root.left, l, h, ans);
        //adding elements to list if it is given range
        if(root.data >= l && root.data <= h) ans.add(root.data);
        help(root.right, l, h, ans);
    }
    int getCount(Node root,int l, int h)
    {
        //Your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        help(root, l, h, ans);
        
        //returning the size of list
        return ans.size();
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
    }
}


//Optimized Solution
class Solution
{
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
        int nodes = 0;
        //Morris Traversal
        Node curr = root;
        while(curr!=null)
        {
            //case 1 : if there is no subtree present in left
            if(curr.left==null)
            {
                if(curr.data >= l && curr.data <= h) nodes++;
                curr = curr.right;
            }
            else
            {
                Node thread = curr.left;
                //going to left subtree's right most element
                while(thread.right != null && thread.right != curr)
                    thread = thread.right;
                    
                //case 2 : if thread is not present
                if(thread.right == null)
                {
                    thread.right = curr;
                    curr = curr.left;
                }
                //case 3 : if thread is present already
                else
                {
                    thread.right = null;
                    if(curr.data >= l && curr.data <= h) nodes++;
                    curr = curr.right;
                }
            }
        }
        return nodes;
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
