/*
Given a Binary Search Tree of size N, find the Median of its Node values.

Example 1:

Input:
       6
     /   \
   3      8   
 /  \    /  \
1    4  7    9
Output: 6
Explanation: Inorder of Given BST will be:
1, 3, 4, 6, 7, 8, 9. So, here median will 6.

Example 2:

Input:
       6
     /   \
   3      8   
 /   \    /   
1    4   7   
Output: 5
Explanation:Inorder of Given BST will be:
1, 3, 4, 6, 7, 8. So, here median will
(4 + 6)/2 = 10/2 = 5.

*/

class Tree
{
    public static void inorder(Node root, ArrayList<Integer> arr)
    {
        if(root==null)return;
        
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
    public static float findMedian(Node root)
    {
        // code here.
        ArrayList<Integer> arr = new ArrayList<>();
        //usual inorder traversal of tree
        inorder(root, arr);
        
        int len = arr.size();
        float ans = 0.0f;
        //if len is odd return middle element
        if(len%2==1)ans = arr.get(len/2);
        //else average of middle two elemets
        else ans = ( arr.get(len/2) + arr.get((len/2)-1) )/2.0f;
        
        return ans;
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
    }
}
