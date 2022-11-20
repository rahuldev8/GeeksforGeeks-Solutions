/*
Given two binary trees, the task is to find if both of them are identical or not. 


Example 2:

Input:
     1          1
   /   \      /   \
  2     3    2     3
Output: Yes
Explanation: There are two trees both
having 3 nodes and 2 edges, both trees
are identical having the root as 1,
left child of 1 is 2 and right child
of 1 is 3.
Example 2:

Input:
    1       1
  /  \     /  \
 2    3   3    2
Output: No
Explanation: There are two trees both
having 3 nodes and 2 edges, but both
trees are not identical.

*/


class Solution
{
    //Function to check if two trees are identical.
    public static void preOrder(Node root, List<Integer>list)
    {
        if(root==null)return;
        
        list.add(root.data);
        if(root.left!=null)preOrder(root.left,list);
        if(root.right!=null)preOrder(root.right,list);
    }
	boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	    List<Integer> list1 = new ArrayList<Integer>();
	    List<Integer> list2 = new ArrayList<Integer>();
	    preOrder(root1, list1);
	    preOrder(root2, list2);
	    
	    if(list1.equals(list2))return true;
	    else 
	    return false;
	}
	//Time Complexity : o(n)
	//Space Complexity : o(n)
	
}
