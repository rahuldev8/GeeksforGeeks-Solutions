/*
Given a matrix with n rows and m columns. Your task is to find the kth element which is obtained while traversing the matrix spirally. You need to complete the method findK which takes four arguments the first argument is the matrix A and the next two arguments will be n and m denoting the size of the matrix A and then the forth argument is an integer  k denoting the kth element . The function will return the kth element obtained while traversing the matrix spirally.


Example 1:

Input:
n = 3, m = 3, k = 4
A[][] = {{1 2 3},
         {4 5 6},
         {7 8 9}}
Output:
6
Explanation:
The matrix above will look like 
1 2 3
4 5 6
7 8 9
and the 4th element in spiral fashion
will be 6 .
*/

class GfG
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here	
	    int start_row = 0, start_col = 0;
	    int end_row = n-1;
	    int end_col = m-1;
	    
	    while(start_row <= end_row && start_col <= end_col)
	    {
	        //Right Direction
	        for(int i=start_col; i<=end_col; i++)
	        {
	            k--;
	            if(k==0)return A[start_row][i];
	        }
	        start_row++;
	        
	        //down Direction
	        for(int i=start_row; i<=end_row; i++)
	        {
	            k--;
	            if(k==0)return A[i][end_col];
	        }
	        end_col--;
	        
	        
	        //Left Direction
	        if(start_row <= end_row)
	        {
	            for(int i=end_col; i>=start_col; i--)
	            {
	                k--;
	                if(k==0)return A[end_row][i];
	            }
	        }
	        
	        end_row--;
	        
	        //Up direction
	        if(start_col <= end_col)
	        {
	            for(int i=end_row; i>=start_row; i--)
	            {
	                k--;
	                if(k==0)return A[i][start_col];
	            }
	        }
	        
	        start_col++;
	    }
	    
	    return -1;
	    //Time Complexity : O(N*M)
	    //Space Complexity : O(N*M)
    }
}
