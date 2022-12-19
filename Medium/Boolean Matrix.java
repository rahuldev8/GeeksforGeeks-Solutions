/*
Given a boolean matrix of size RxC where each cell contains either 0 or 1, modify it such that if a matrix cell matrix[i][j] is 1 then all the cells in its ith row and jth column will become 1.

Example 1:

Input:
R = 2, C = 2
matrix[][] = {{1, 0},
              {0, 0}}
Output: 
1 1
1 0 
Explanation:
Only cell that has 1 is at (0,0) so all 
cells in row 0 are modified to 1 and all 
cells in column 0 are modified to 1.

Example 2:

Input:
R = 4, C = 3
matrix[][] = {{ 1, 0, 0},
              { 1, 0, 0},
              { 1, 0, 0},
              { 0, 0, 0}}
Output: 
1 1 1
1 1 1
1 1 1
1 0 0 
Explanation:
The position of cells that have 1 in
the original matrix are (0,0), (1,0)
and (2,0). Therefore, all cells in row
0,1,2 are and column 0 are modified to 1. 
*/

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        //Algorithm
        /*
        1.check first row for ones
        2.check first col for ones
        3.mark values from inner matrix to first row and col
        4.fill the values with obtained data to inner matrix
        5.process the first row
        6.process the first col
        */
        
        boolean oneRow = false;
        boolean oneCol = false;
        
        //step 1: check for first row
        for(int j=0; j<matrix[0].length; j++)
        {
            if(matrix[0][j]==1)
            {
                oneRow = true;
                break;
            }
        }
        //step 2: check for first col
        for(int i=0; i<matrix.length; i++)
        {
            if(matrix[i][0]==1)
            {
                oneCol = true;
                break;
            }
        }
        //step 3:Mark values in first row and col
        for(int i=1; i<matrix.length; i++)
        {
            for(int j=1; j<matrix[0].length; j++)
            {
                if(matrix[i][j]==1)
                {
                    matrix[i][0] = 1;
                    matrix[0][j] = 1;
                }
            }
        }
        //step 4: with obtained data fill inner matrix
        for(int i=1; i<matrix.length; i++)
        {
            for(int j=1; j<matrix[0].length; j++)
            {
                if(matrix[i][0]==1 || matrix[0][j]==1)
                    matrix[i][j] = 1;
            }
        }
        
        //step 5: process the first row
        if(oneRow==true)
        {
            for(int j=0; j<matrix[0].length; j++)
            matrix[0][j] = 1;
        }
        
        //step 6: process the first row
        if(oneCol==true)
        {
            for(int i=0; i<matrix.length; i++)
            matrix[i][0] = 1;
        }
        
        //Time Complexity : o(n*m)
        //Space Complexity : o(1)
    }
}
