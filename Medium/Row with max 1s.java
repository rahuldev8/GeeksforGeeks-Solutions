/*
Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

Example 1:

Input: 
N = 4 , M = 4
Arr[][] = {{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}}
Output: 2
Explanation: Row 2 contains 4 1's (0-based
indexing).

Example 2:

Input: 
N = 2, M = 2
Arr[][] = {{0, 0}, {1, 1}}
Output: 1
Explanation: Row 1 contains 2 1's (0-based
indexing).
*/
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        //Since the given matrix is sorted, we can traverse by column wise
        //and if 1 found there return row, since the question demands the first row
        
        for(int col=0; col<m; col++)
        {
            for(int row=0; row<n; row++)
            {
                //if one found,return its row
                if(arr[row][col]==1)return row;
            }
        }
        return -1;
        //Time Complexity : o(n+m)
        //Space Complexity : o(1)
    }
}
