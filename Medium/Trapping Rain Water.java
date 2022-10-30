/*
Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 
 

Example 1:

Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10
*/


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int[] lm = new int[n];
        int[] rm = new int[n];
        long water = 0;
        
        lm[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            lm[i]=Math.max(arr[i],lm[i-1]);
        }
        
        rm[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rm[i]=Math.max(arr[i],rm[i+1]);
        }
        
        for(int i=0;i<n;i++)
        {
            water+=Math.min(lm[i],rm[i])-arr[i];
        }
        return water;
    } 
}
//Time Complexity : o(n)
//Space Complexity : o(n)
