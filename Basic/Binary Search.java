/*
Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.

Example 1:

Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.

Example 2:

Input:
N = 5
arr[] = {11 22 33 44 55} 
K = 445
Output: -1
Explanation: 445 is not present.
*/

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int start = 0;
        int end = n-1;
        while(start <= end)
        {
            int mid = (start+end)/2;
            //if target lies on left side of mid(smaller than mid)
            if(k < arr[mid])
            {
                end = mid-1;
            }
            //if target lies on right side of mid(larger than mid)
            else if(k > arr[mid])
            {
                start = mid+1;
            }
            else
            {
                //If match found, return it
                return mid;
            }
        }
        //If no match found
        return -1;
        
        //Time Complexity : o(log N) Advantage of binary search
        //Space Complexity: o(1)
    }
}
