/*
The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two end nodes. The diagram below shows two trees each with diameter nine, the leaves that form the ends of the longest path are shaded (note that there is more than one path in each tree of length nine, but no path longer than nine nodes). 



Example 1:

Input:
       1
     /  \
    2    3
Output: 3
Example 2:

Input:
         10
        /   \
      20    30
    /   \ 
   40   60
Output: 4

*/


class Solution {
  public:
    // Function to return the diameter of a Binary Tree.
    
    //Funtion to find height
    int height(Node* root)
    {
        if(root==NULL)return 0;
        
        int lh = height(root->left);
        int rh = height(root->right);
        
        return 1+max(lh,rh);
    }
    
    //Function to find width
    int width(Node* root)
    {
        if(root==NULL) return 0;
        
        int l = height(root->left);
        int r = height(root->right);
        int lw = width(root->left);
        int rw = width(root->right);
        
        //width of tree is always maximum of left width and right width of node, plus current node
        return max(l+r+1, max(lw,rw));
    }
    int diameter(Node* root) {
        
        int ans = width(root);
        return ans;
        // Your code here
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
    }
};
