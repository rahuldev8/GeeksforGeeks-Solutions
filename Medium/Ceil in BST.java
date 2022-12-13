/*
Given a BST and a number X, find Ceil of X.
Note: Ceil(X) is a number that is either equal to X or is immediately greater than X.

Example 1:

Input:
      5
    /   \
   1     7
    \
     2 
      \
       3
X = 3
Output: 3
Explanation: We find 3 in BST, so ceil
of 3 is 3.
Example 2:

Input:
     10
    /  \
   5    11
  / \ 
 4   7
      \
       8
X = 6
Output: 7
Explanation: We find 7 in BST, so ceil
of 6 is 7.
*/

class Tree {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        
        Node curr = root;
        int ceil = -1;
        while(curr!=null)
        {
            //if target found store it in ceil, and return it
            if(curr.data == key)
            {
                ceil = curr.data;
                return ceil;
            }
            //case 2 : if root data is less than key, move to right part
            if(curr.data < key)
                curr = curr.right;
            //case 3 : if root data is greater, store it, and move to left part(less values)
            else
            {
                ceil = curr.data;
                curr = curr.left;
            }
        }
        return ceil;
        
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
