/*
Given a Binary Tree of size N , You have to count leaves in it. For example, there are two leaves in following tree

        1
     /      \
   10      39
  /
5

 

Example 1:


Input:
Given Tree is 
               4
             /   \
            8     10
           /     /   \
          7     5     1
         /
        3 
Output:
3
Explanation: 
Three leaves are 3 , 5 and 1.
*/

int countLeaves(Node* root)
{
  // Your code here
  
  if(root==NULL)//If there is NO Node return 0
  return 0;
  
  if(root->left == NULL && root->right == NULL)
  return 1; //If it is Leaf node, then left and right will be NULL, 
  //the contritube 1 to total count
  
  int left = countLeaves(root->left);//count of total number of leafs in left subtree of current root
  int right = countLeaves(root->right);//count of total number of leafs in right subtree of current root
  
  return left+right;
  
  //Time Complexity : o(n)
  //SPace Complexity : o(n)
}
