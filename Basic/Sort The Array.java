/*
Given a random set of numbers, Print them in sorted order.

Example 1:

Input:
N = 4
arr[] = {1, 5, 3, 2}
Output: {1, 2, 3, 5}
Explanation: After sorting array will 
be like {1, 2, 3, 5}.*/

class Solution 
{ 
    int[] sortArr(int[] arr, int n) 
    { 
        Arrays.sort(arr);
        return arr;
    }
} 
