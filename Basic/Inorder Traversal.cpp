/*
Given a Binary Tree, find the In-Order Traversal of it.

Example 1:

Input:
       1
     /  \
    3    2
Output: 3 1 2

*/

class Solution {
  public:
  
  void inorder(Node* root, vector<int>&v)
  {
      if(root==NULL)return;
      
      inorder(root->left, v);
      v.push_back(root->data);
      inorder(root->right, v);
  }
    // Function to return a list containing the inorder traversal of the tree.
    vector<int> inOrder(Node* root) {
        
        vector<int> v;
        
        inorder(root, v);
        
        return v;
        // Your code here
    }
};
