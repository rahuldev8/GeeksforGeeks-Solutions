/*
Write a program to find the transpose of a square matrix of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.

Example 1:

Input:
N = 4
mat[][] = {{1, 1, 1, 1},
           {2, 2, 2, 2}
           {3, 3, 3, 3}
           {4, 4, 4, 4}}
Output: 
{{1, 2, 3, 4},  
 {1, 2, 3, 4}  
 {1, 2, 3, 4}
 {1, 2, 3, 4}} 
Example 2:

Input:
N = 2
mat[][] = {{1, 2},
           {-9, -2}}
Output:
{{1, -9}, 
 {2, -2}}
 */

class Solution
{
    //Function to find transpose of a matrix.
    static void transpose(int matrix[][], int n)
    {
        //Transpose of matrix in-place
        int row = matrix.length;
        int col = matrix[0].length;
        //go to each row
        for(int i=0; i<row; i++)
        {
            //each coloum, with respect to rows, since it should not be overwritten by next rows
            for(int j=i; j<col; j++)
            {
                //simply interchanging values
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //Time Complexity : o(n*n)
        //Space Complexity : o(1)
    }
}
