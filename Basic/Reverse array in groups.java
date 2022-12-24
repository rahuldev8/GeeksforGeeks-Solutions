/*
Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

Note: If at any instance, there are no more subarrays of size greater than or equal to K, then reverse the last subarray (irrespective of its size). You shouldn't return any array, modify the given array in-place.

Example 1:

Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.
 

Example 2:

Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9
*/
class Solution {
    //Function to reverse every sub-array group of size k.
    void reverse(ArrayList<Integer> arr, int start, int end)
    {
        while(start<end)
        {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for(int i=0; i<n; i=i+k)
        {
            if(i+k<n)
                reverse(arr, i, i+k-1);
            else
                reverse(arr, i, n-1);
        }
    }
    //Time Complexity : o(n)
    //Space Complexity : o(1)
}
