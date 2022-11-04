/*
Example 1:

Input:
BST1:
       5
     /   \
    3     6
   / \
  2   4  
BST2:
        2
      /   \
     1     3
            \
             7
            /
           6
Output: 1 2 2 3 3 4 5 6 6 7
Explanation: 
After merging and sorting the
two BST we get 1 2 2 3 3 4 5 6 6 7.
Example 2:

Input:
BST1:
       12
     /   
    9
   / \    
  6   11
BST2:
      8
    /  \
   5    10
  /
 2
Output: 2 5 6 8 9 10 11 12
Explanation: 
After merging and sorting the
two BST we get 2 5 6 8 9 10 11 12.
*/

class Solution
{
    public:
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
    
    
    //User defined function to traverse a given tree ans push all values to vector
    void result(Node* root,vector<int>&v)
    {
        if(root==NULL)return;
        
        v.push_back(root->data);
        result(root->left,v);
        result(root->right,v);
        
    }
    vector<int> merge(Node *root1, Node *root2)
    {
       //Your code here
       vector<int>v;
       result(root1,v);//passing first tree
       result(root2,v);//passing second tree
       
       sort(v.begin(), v.end());//sorting the final vector
       return v;
       
       //Time Complexity : o(n log n) due to vector sort
       //Space Complexity : o(n)
    }
};
