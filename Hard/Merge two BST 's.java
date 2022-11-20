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
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
    public static void travel(Node root, List<Integer>list)
    {
        if(root==null)return;
        
        if(root.left!=null)travel(root.left, list);
        list.add(root.data);
        if(root.right!=null)travel(root.right, list);
    }
    public List<Integer> merge(Node root1,Node root2)
    {
        // Write your code here
        List<Integer> list = new ArrayList<Integer>();
        
        
        travel(root1,list);//passing first tree
        travel(root2,list);//passing second tree
        
        Collections.sort(list);//sorting the final list
        
        return list;
    }
}      //Time Complexity : o(n log n)
       //Space Complexity : o(n)
