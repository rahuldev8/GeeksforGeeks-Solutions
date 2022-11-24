/*
Given a Binary Search Tree. The task is to find the minimum element in this given BST.

Example 1:

Input:
           5
         /    \
        4      6
       /        \
      3          7
     /
    1
Output: 1
Example 2:

Input:
             9
              \
               10
                \
                 11
Output: 9

*/

class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        if(node==null)return -1;
        
        Node temp = node;
        
        //in BST, left most child will have the Minimum Value
        while(temp.left!=null)
        {
            temp = temp.left;
        }
        
        return temp.data;
        
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
