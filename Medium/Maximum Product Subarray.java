/*
Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

Example 1:

Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is [6, -3, -10] which gives product as 180.
Example 2:

Input:
N = 6
Arr[] = {2, 3, 4, 5, -1, 0}
Output: 120
Explanation: Subarray with maximum product
is [2, 3, 4, 5] which gives product as 120.
*/

class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        //Just maintain a min for every element and apply Kadane's Algo
        long maxTemp = arr[0];
        long minTemp = arr[0];
        long ans = arr[0];
        
        //To handle negative and 0's we are maintaing minTemp
        
        for(int i=1; i<n; i++)
        {
            //after performing maxTemp value, the value will change for minTemp calculation,
            //therefore storing it 
            long temp = maxTemp;
            maxTemp = Math.max(arr[i], Math.max(arr[i]*maxTemp, arr[i]*minTemp));
            minTemp = Math.min(arr[i], Math.min(arr[i]*temp, arr[i]*minTemp));
            ans = Math.max(ans, maxTemp);
        }
        
        return ans;
        //Time Complexity : O(n)
        //Space Complexity : O(1)
    }
}
