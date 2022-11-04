/*
Given a binary tree, find its height.


Example 1:

Input:
     1
    /  \
   2    3
Output: 2
Example 2:

Input:
  2
   \
    1
   /
 3
Output: 3   

*/

class Solution{
    public:
    //Function to find the height of a binary tree.
    int height(struct Node* node){
        
        if(node==NULL)return 0;//If there is No Node
        
        int lh = height(node->left);//recursively calculating left height of current node 
        
        int rh = height(node->right);//recursively calculating right height of current node 
        
        return 1+max(lh,rh);//if it is not null, then contribution of this node for calcualting height of tree is 1
        // code here 
        
        //Time Complexity: o(n)
        //Space Complexity : o(n)
    }
};
