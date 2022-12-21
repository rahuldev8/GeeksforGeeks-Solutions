/*
Given an array A of n positive numbers. The task is to find the first Equilibrium Point in an array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Note: Retun the index of Equilibrium point. (1-based index)

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 3 
Explanation:  
equilibrium point is at position 3 
as elements before it (1+3) = 
elements after it (2+2). 
 

Example 2:

Input:
n = 1
A[] = {1}
Output: 1
Explanation:
Since its the only element hence
its the only equilibrium point.
*/
class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        long rightSum = 0;
        for(int i=n-1; i>=0; i--)
            rightSum += arr[i];
        
        long leftSum = 0;
        
        for(int i=0; i<n; i++)
        {
            rightSum -= arr[i];
            
            if(leftSum==rightSum)
                return i+1;
            
            leftSum += arr[i];
        }
        
        return -1;
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
