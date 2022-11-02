/*
Given a binary tree, find its level order traversal.
Level order traversal of a tree is breadth-first traversal for the tree.


Example 1:

Input:
    1
  /   \ 
 3     2
Output:1 3 2
Example 2:

Input:
        10
     /      \
    20       30
  /   \
 40   60
Output:10 20 30 40 60

*/

class Solution
{
    public:
    //Function to return the level order traversal of a tree.
    vector<int> levelOrder(Node* root)
    {
      //Your code here
      vector<int> vec; //new vector
      if(root==NULL)return vec; //if there is no tree return empty vector
      
      queue<Node*>q; //a queue which can hold node's address
      Node* curr = root; //copying root value to curr, coz we should never disturb root pointer
      q.push(curr);//pusing root to queue
      
      while(!q.empty()) //loop will print untill queue becomes empty
      {
          Node *temp = q.front(); //temp pointer points to first node in queue
          q.pop(); //even though we are popping the node from queue, its address is already in temp
          vec.push_back(temp->data);//push node's data to vector
          if(temp->left != NULL) q.push(temp->left); //if current node's left is not null, then push that to queue
          if(temp->right != NULL) q.push(temp->right); //if current node's right is not null, then push that to queue
      }
    }
    
    //Time Complexity : o(n)
    //Space Complexity : o(n)
};
