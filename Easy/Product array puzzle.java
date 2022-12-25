/*
Given an array nums[] of size n, construct a Product Array P (of same size n) such that P[i] is equal to the product of all the elements of nums except nums[i].

 

Example 1:

Input:
n = 5
nums[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900
Explanation: 
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.
Example 2:

Input:
n = 2
nums[] = {12,0}
Output:
0 12
*/

class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
	    //Maintain left and right Subarrays which will maintain the product of left and right elements except itself.....
        long[] left = new long[n];
        long[] right = new long[n];
        
        //resultanat array
        long[] res = new long[n];
        
        //populating left product array
        left[0] = 1;
        for(int i=1; i<n; i++)
            left[i] = left[i-1]*nums[i-1];
            
        
        //populating right product array
        right[n-1] = 1;
        for(int i=n-2; i>=0; i--)
            right[i] = right[i+1]*nums[i+1];    
            
            
        //final value filling
        for(int i=0; i<n; i++)
            res[i] = left[i]*right[i];
        
        return res;
        //Time Complexity : O(n)
        //Space Complexity : O(n)
	} 
} 
