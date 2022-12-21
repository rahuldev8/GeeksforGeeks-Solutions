/*
Given a matrix of size n x m, where every row and column is sorted in increasing order, and a number x. Find whether element x is present in the matrix or not.

Example 1:

Input:
n = 3, m = 3, x = 62
matrix[][] = {{ 3, 30, 38},
              {36, 43, 60},
              {40, 51, 69}}
Output: 0
Explanation:
62 is not present in the matrix, 
so output is 0.
Example 2:

Input:
n = 1, m = 6, x = 55
matrix[][] = {{18, 21, 27, 38, 55, 67}}
Output: 1
Explanation: 55 is present in the matrix.
*/

class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    // code here 
	    int row = 0;
	    int col = m-1;
	    
	    while(row<n && col>=0)
	    {
	        if(matrix[row][col]==x) return true;
	        
	        if(matrix[row][col]<x) row++;
	        else
	            col--;
	    }
	    return false;
	    
	    //Time Complexity : o(n)
	    //Space Complexity : o(1)
	} 
} 
