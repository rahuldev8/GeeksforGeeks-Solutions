/*
Given a matrix of size r*c. Traverse the matrix in spiral form.

Example 1:

Input:
r = 4, c = 4
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15,16}}
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
Explanation:

Example 2:

Input:
r = 3, c = 4  
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12}}
Output: 
1 2 3 4 8 12 11 10 9 5 6 7
Explanation:
Applying same technique as shown above, 
output for the 2nd testcase will be 
1 2 3 4 8 12 11 10 9 5 6 7.
*/

class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> res = new ArrayList<>();
        int start_row=0,start_col=0;
	    int end_row=r-1;
	    int end_col=c-1;
	    
	    while(start_row <= end_row && start_col <= end_col)
	    {
	        //Right Direction
	        for(int i=start_col; i<=end_col; i++)
	            res.add(matrix[start_row][i]);
	            
	            
	        start_row++;
	        
	        //Down Direction
	        for(int i=start_row; i<=end_row; i++)
	            res.add(matrix[i][end_col]);
	            
	            
	        end_col--;
	        
	        //left Direction
	        if(start_row<=end_row)
	        {
	            for(int i=end_col; i>=start_col; i--)
    	            res.add(matrix[end_row][i]);
	        }
	        end_row--;
	        
	        //Up Direction
	        if(start_col <= end_col)
	        {
	            for(int i=end_row; i>=start_row; i--)
    	            res.add(matrix[i][start_col]);
	        }
	        start_col++;
	    }
	    
	    return res;
	    //Time Complexity : O(n*m)
	    //Space Complexity :O(1)
    }
}
