/*
Given a Binary Tree, convert it into its mirror.
MirrorTree1            

Example 1:

Input:
      1
    /  \
   2    3
Output: 3 1 2
Explanation: The tree is
   1    (mirror)  1
 /  \    =>      /  \
2    3          3    2
The inorder of mirror is 3 1 2
Example 2:

Input:
      10
     /  \
    20   30
   /  \
  40  60
Output: 30 10 60 20 40
Explanation: The tree is
      10               10
    /    \  (mirror) /    \
   20    30    =>   30    20
  /  \                   /   \
 40  60                 60   40
The inroder traversal of mirror is
30 10 60 20 40.

*/


class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node root) {
        // Your code here
        if(root==null) return;
        
        //just replacing right to left
        Node temp = null;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        //traversing to other nodes
        mirror(root.left);
        mirror(root.right);
        
        //Time Complexity: o(n)
        //Space Complexity : o(n)
    }
}
