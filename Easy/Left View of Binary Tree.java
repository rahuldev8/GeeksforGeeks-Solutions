/*
Given a Binary Tree, print Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument.

Left view of following tree is 1 2 4 8.

          1
       /     \
     2        3
   /     \    /    \
  4     5   6    7
   \
     8   

Example 1:

Input:
   1
 /  \
3    2
Output: 1 3

*/
//Function to return a list containing elements of left view of the binary tree.
// vector<int> leftView(Node *root)
// {
//    // Your code here
//    vector<int>leftview;
//    if(!root)return leftview;
   
//    queue<Node *>q;
//    q.push(root);
   
//    while(!q.empty())
//    {
//        vector<int>v;
//        int count = q.size();
//        while(count != 0)
//        {
//            //temp will always point to first elem in queue
//            Node * temp = q.front();
//            //after processing popping the first element
//            q.pop();
//            v.push_back(temp->data);
//            //if left and right are having some nodes push them to queue
//            if(temp->left != NULL) q.push(temp->left);
//            if(temp->right != NULL) q.push(temp->right);
//            count--;
//        }
//        leftview.push_back(v[0]);
//    }
//    return leftview;
   
//    //Time Complexity : o(n) even it is nested loop, we are visting every node once
//    //Space Complexity : o(n) //size occupied by queue is n/2(n is number of nodes)
// }

class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ar = new ArrayList<>();
      if(root==null)return ar;
      
      Queue<Node> q = new LinkedList<>();
      
      q.add(root);
      
      while(!q.isEmpty())
      {
          ArrayList<Integer> tar = new ArrayList<>();
          int count = q.size();
          
          while(count!=0)
          {
              Node temp = q.peek();
              q.remove();
              
              tar.add(temp.data);
              if(temp.left!=null)q.add(temp.left);
              if(temp.right!=null)q.add(temp.right);
              count--;
          }
          ar.add(tar.get(0));
      }
      
      return ar;
    }
}
