/*
Given a Binary search tree. Your task is to complete the function which will return the Kth largest element without doing any modification in Binary Search Tree.


Example 1:

Input:
      4
    /   \
   2     9
k = 2 
Output: 4

Example 2:

Input:
       9
        \ 
          10
K = 1
Output: 10
*/

class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        //Morris Reverse Inorder Traversal
        int count = 0;
        
        Node curr = root;
        while(curr!=null)
        {
            //case 1 : if right subtree is null
            if(curr.right==null)
            {
                count++;
                if(count==K)return curr.data;
                curr = curr.left;
            }
            else
            {
                Node thread = curr.right;
                //move to the right subtree's left most element
                while(thread.left!=null && thread.left != curr)
                    thread = thread.left;
                    
                //case 2 : if thread is not present
                if(thread.left==null)
                {
                    thread.left = curr;
                    curr = curr.right;
                }
                //case 3 : if thread is prenent already
                else
                {
                    thread.left = null;
                    count++;
                    if(count==K)return curr.data;
                    curr = curr.left;
                }
            }
        }
        return -1;
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
