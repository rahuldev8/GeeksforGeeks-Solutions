/**
Given a Binary Tree, find Right view of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from right side.

Right view of following tree is 1 3 7 8.

          1
       /     \
     2        3
   /   \      /    \
  4     5   6    7
    \
     8

Example 1:

Input:
       1
    /    \
   3      2
Output: 1 2
Example 2:

Input:
     10
    /   \
  20     30
 /   \
40  60 
Output: 10 30 60

*/
class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> ar = new ArrayList<>();
        if(node==null)return ar;
        
        Queue<Node>q = new LinkedList<>();
        q.add(node);
        
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
            ar.add(tar.get(tar.size()-1));
        }
        return ar;
        
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
    
}

