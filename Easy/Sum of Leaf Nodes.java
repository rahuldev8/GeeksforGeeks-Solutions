/*
Given a Binary Tree of size N. The task is to complete the function sumLeaf(), that should return the sum of all the leaf nodes of the given binary tree.*/


class GfG
{
    int sum(Node root)
    {
        if(root==null)return 0;
        
        //if it is leaf, return its data
        if(root.left==null && root.right==null) return root.data;
        
        int left =  sum(root.left);
        int right = sum(root.right);
        //return sum of all leaves in left ans right subtrees
        return left+right;
    }
    public int SumofLeafNodes(Node root)
    {
        // your code here
        int count = sum(root);
        return count;
    }
    //Time Complexity : o(n)
    //Space Complexity : o(n)
}
