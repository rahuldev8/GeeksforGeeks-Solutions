/*
Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.


Example 1:

Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
Example 2:

Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element (-1)

*/

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        long sum = arr[0];
        long curr = arr[0];
        
        for(int i=1;i<n;i++)
        {
            curr = Math.max(arr[i], arr[i]+curr);
            if(curr>sum)sum=curr;
        }
        return sum;
        
        //Time Complexity : o(n)
        //Space Complexity : o(1)
        
        // Your code here
        
    }
    
}
