/*
Given a square matrix[][] of size N x N. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.

Example 1:

Input:
N = 3
matrix[][] = [[1 2 3],
              [4 5 6],
              [7 8 9]]
Output:
3 6 9 
2 5 8 
1 4 7
*/
class GFG
{
    static void rotate(int matrix[][]) 
    {
        //Matrix Anti Clockwiswe Rotation
        //Step 1: reverse every rows in given matrix
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i=0; i<row; i++)
        {
            //Reverse logic for a particular row
            int start = 0;
            int end = row-1;
            
            while(start<end)
            {
                int temp = matrix[i][start];
                matrix[i][start++] = matrix[i][end];
                matrix[i][end--] = temp;
            }
        }
        
        //Step 2 : perform transpose for reversed matrix
        for(int i=0; i<row; i++)
        {
            for(int j=i; j<col; j++)
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
