/*
Given a matrix as 2D array. Find the reverse spiral traversal of the matrix. 

Example 1:

Input: R = 3, C = 3
  a = {{9, 8, 7},
       {6, 5, 4},
       {3, 2, 1}}
Output: 5 6 3 2 1 4 7 8 9
Explanation: Spiral form of the matrix
in reverse order starts from the centre 
and goes outward.


Example 2:

Input: R = 4, C = 4 
  a = {{1, 2, 3, 4},
       {5, 6, 7, 8},
       {9, 10, 11, 12}, 
       {13, 14, 15, 16}}
Output: 10 11 7 6 5 9 13 14 15 16 12 8 4 3 2 1
Explanation: 

*/

class Solution
{
    public void reverse(int[] arr, int start, int end)
    {
        while(start<=end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        int[] result = new int[R*C];
        
        int start_row=0,start_col=0;
	    int end_row=R-1;
	    int end_col=C-1;
	    int k=0;
	    
	    while(start_row <= end_row && start_col <= end_col)
	    {
	        //Right Direction
	        for(int i=start_col; i<=end_col; i++)
	            result[k++] = a[start_row][i];
	            
	            
	        start_row++;
	        
	        //Down Direction
	        for(int i=start_row; i<=end_row; i++)
	            result[k++] = a[i][end_col];
	            
	            
	        end_col--;
	        
	        //left Direction
	        if(start_row<=end_row)
	        {
	            for(int i=end_col; i>=start_col; i--)
    	            result[k++] = a[end_row][i];
	        }
	        end_row--;
	        
	        //Up Direction
	        if(start_col <= end_col)
	        {
	            for(int i=end_row; i>=start_row; i--)
    	            result[k++] = a[i][start_col];
	        }
	        start_col++;
	    }
	    
	    reverse(result,0,R*C-1);
	    return result;
	    
	    //Time Complexity : O(n*m)
	    //Space Complexity : o(n*m)
    }
}
