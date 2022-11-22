/*
Given an array of length N consisting of only 0s and 1s in random order. Modify the array to segregate 0s on left side and 1s on the right side of the array.

Example 1:

Input:
N = 5
arr[] = {0, 0, 1, 1, 0}
Output: 0 0 0 1 1

Example 2:

Input:
N = 4
Arr[] = {1, 1, 1, 1}
Output: 1 1 1 1
Explanation: There are no 0 in the given array, 
so the modified array is 1 1 1 1.

*/


class Solution {
    void segregate0and1(int[] arr, int n) {
        // code here
        int zc = 0;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 0) zc++;
        }
        
        for(int i=0;i<zc;i++)
        {
            arr[i] = 0;
        }
        
        for(int i=zc;i<n;i++)
        {
            arr[i] = 1;
        }
    }
    
    //Time Complexity : o(n)
    //Time Complexity : o(1)

}
