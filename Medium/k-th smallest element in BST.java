/*
Given a BST and an integer K. Find the Kth Smallest element in the BST using O(1) extra space. 

Example 1:

Input:
      2
    /   \
   1     3
K = 2
Output: 2
Explanation: 2 is the 2nd smallest element in the BST

Example 2:

Input:
        2
      /  \
     1    3
K = 5
Output: -1
Explanation: There is no 5th smallest element in the BST as the size of BST is 3
*/

class Solution {
    // Return the Kth smallest element in the given BST
    public int KthSmallestElement(Node root, int K) {
        //Inorder Morris Traversal\
        int count = 0;
        //int ans = -1;
        
        Node curr = root;
        
        while(curr!=null)
        {
            //case 1 : if left side is null
            if(count==K) return curr.data;
            if(curr.left == null)
            {
                count++;
                if(count==K) return curr.data;
                curr = curr.right;
            }
            else
            {
                Node prev = curr.left;
                //Going to right most element of left subtree
                while(prev.right!=null && prev.right!=curr)
                    prev = prev.right;
                    
                //case 2 : if there is no thread
                if(prev.right==null)
                {
                    prev.right = curr;
                    curr = curr.left;
                }
                
                //case 3 : if thread is present already
                else
                {
                    prev.right = null;
                    count++;
                    if(count==K) return curr.data;
                    curr = curr.right;
                }
            }
        }
        return -1;
        
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
