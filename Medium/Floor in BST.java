/*
You are given a BST(Binary Search Tree) with n number of nodes and value x. your task is to find the greatest value node of the BST which is smaller than or equal to x.
Note: when x is smaller than the smallest node of BST then returns -1.

Example:

Input:
n = 7               2
                     \
                      81
                    /     \
                 42       87
                   \       \
                    66      90
                   /
                 45
x = 87
Output:
87
Explanation:
87 is present in tree so floor will be 87.
Example 2:

Input:
n = 4                     6
                           \
                            8
                          /   \
                        7       9
x = 11
Output:
9
*/

class Solution {
    public static int floor(Node root, int x) {
        // Code here
        Node curr = root;
        int floor = -1;
        while(curr!=null)
        {
            //case 1 : if match found
            if(curr.data == x) return curr.data;
            
            //case 2 : if current data is large, just move to left
            if(curr.data > x)
                curr = curr.left;
            //case 3 : if low value is found
            else
            {
                floor = curr.data;
                curr = curr.right;
            }
        }
        return floor;
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
