/*
Given a Binary Search Tree and a range [low, high]. Find all the numbers in the BST that lie in the given range.
Note: Element greater than or equal to root go to the right side.

Example 1:

Input:
       17
     /    \
    4     18
  /   \
 2     9 
l = 4, h = 24
Output: 4 9 17 18 
Example 2:

Input:
       16
     /    \
    7     20
  /   \
 1    10
l = 13, h = 23
Output: 16 20 
*/
class Solution
{   
    //Function to return a list of BST elements in a given range.
    public static void helper(Node root, int low, int high, ArrayList<Integer> arr)
    {
        if(root==null)return;
        
        helper(root.left, low, high, arr);
        if(root.data >= low && root.data <= high) arr.add(root.data);
        helper(root.right, low, high, arr);
    }
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
        // code here.
        ArrayList<Integer> arr = new ArrayList<Integer>();
        helper(root, low, high, arr);
        return arr;
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
    }
    
}
