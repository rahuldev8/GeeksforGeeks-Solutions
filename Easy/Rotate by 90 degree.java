/*
Given a square matrix of size N x N. The task is to rotate it by 90 degrees in anti-clockwise direction without using any extra space. 

Example 1:

Input:
N = 3 
matrix[][] = {{1, 2, 3},
              {4, 5, 6}
              {7, 8, 9}}
Output: 
Rotated Matrix:
3 6 9
2 5 8
1 4 7
Example 2:

Input:
N = 2
matrix[][] = {{1, 2},
              {3, 4}}
Output: 
Rotated Matrix:
2 4
1 3
*/
class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
        //reverse each row
        for(int i=0; i<matrix.length; i++)
        {
            int start = 0;
            int end = matrix[0].length-1;
            
            while(start<=end)
            {
                int temp = matrix[i][start];
                matrix[i][start++] = matrix[i][end];
                matrix[i][end--] = temp;
            }
        }
        
        //transpose
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=i; j<matrix[0].length; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Time Complexity : o(n*n)
        //Space Complexity : o(1)
    }
}
