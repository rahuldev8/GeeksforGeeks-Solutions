/*
Given a sorted array arr[] of size N. Find the element that appears only once in the array. All other elements appear exactly twice. 

Example 1:

Input:
N = 11
arr[] = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65}
Output: 4
Explanation: 4 is the only element that 
appears exactly once.
*/

class Solution 
{
    int findOnce(int arr[], int n)
    {
        // Complete this function
        int ans = 0;
        
        for(int i : arr)
        {
            ans ^= i;
        }
        
        return ans;
    }
}
