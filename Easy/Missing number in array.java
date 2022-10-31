/*
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
*/


class Solution {
    int MissingNumber(int array[], int n) {
        int sum = (n*(n+1))/2;
        int arr_sum = 0;
        for(int i:array)
        {
            arr_sum += i;
        }
        return sum-arr_sum;
        
        //Time Complexity : o(n)
        //Space Complexity : o(1)
        // Your Code Here
    }
}
