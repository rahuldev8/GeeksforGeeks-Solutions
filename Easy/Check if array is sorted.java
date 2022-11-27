/*
Given an array arr[] of size N, check if it is sorted in non-decreasing order or not. 

Example 1:

Input:
N = 5
arr[] = {10, 20, 30, 40, 50}
Output: 1
Explanation: The given array is sorted.
Example 2:

Input:
N = 6
arr[] = {90, 80, 100, 70, 40, 30}
Output: 0
Explanation: The given array is not sorted.
*/


class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        
        for(int i=0;i<n-1;i++)
        {
            //if next element is smaller than current element, then array is not sorted
            if(arr[i+1] < arr[i])return false;
        }
        
        return true;
        
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
