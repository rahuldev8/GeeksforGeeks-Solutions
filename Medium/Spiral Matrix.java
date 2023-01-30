/*
Given a matrix of size N x M. You have to find the Kth element which will obtain while traversing the matrix spirally starting from the top-left corner of the matrix.

Example 1:

Input: 
N = 3, M = 3, K = 4
A[] = {{1, 2, 3}, 
       {4, 5, 6}, 
       {7, 8, 9}}
Output: 
6
Explanation: Spiral traversal of matrix: 
{1, 2, 3, 6, 9, 8, 7, 4, 5}. Fourth element
is 6.
Example 2:

Input: 
N = 2, M = 2, K = 2 
A[] = {{1, 2},
       {3, 4}} 
Output: 
2
Explanation: Spiral traversal of matrix: 
{1, 2, 4, 3}. Second element is 2.
*/

class Solution
{
   
	public int findK(int a[][], int n, int m, int k)
	{
	    int start_row=0,start_col=0;
	    int end_row=n-1;
	    int end_col=m-1;
	    
	    while(start_row <= end_row && start_col <= end_col)
	    {
	        //Right Direction
	        for(int i=start_col; i<=end_col; i++)
	        {
	            k--;
	            if(k==0)return a[start_row][i];
	        }
	        start_row++;
	        
	        //Down Direction
	        for(int i=start_row; i<=end_row; i++)
	        {
	            k--;
	            if(k==0)return a[i][end_col];
	        }
	        end_col--;
	        
	        //left Direction
	        if(start_row<=end_row)
	        {
	            for(int i=end_col; i>=start_col; i--)
	            {
	                k--;
	                if(k==0)return a[end_row][i];
	            }
	        }
	        end_row--;
	        
	        //Up Direction
	        if(start_col <= end_col)
	        {
	            for(int i=end_row; i>=start_row; i--)
	            {
	                k--;
	                if(k==0)return a[i][start_col];
	            }
	        }
	        start_col++;
	    }
	    
	    return -1;
	    
	    //Time Complexity : O(n*m)
	    //Space Complexity : O(1)
	}
	
}
