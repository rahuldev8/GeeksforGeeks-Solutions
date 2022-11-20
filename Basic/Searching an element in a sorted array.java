/*
Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.


Example 1:

Input:
N = 5, K = 6
arr[] = {1,2,3,4,6}
Output: 1
Exlpanation: Since, 6 is present in 
the array at index 4 (0-based indexing),
output is 1.
 

Example 2:

Input:
N = 5, K = 2
arr[] = {1,3,4,5,6}
Output: -1
Exlpanation: Since, 2 is not present 
in the array, output is -1.
*/

class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        int s = 0;
        int e = N-1;
        
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(K < arr[mid])
            {
                e = mid-1;
            }
            else if(K > arr[mid])
            {
                s = mid+1;
            }
            //If match found return 1
            else return 1;
        }
        //If match not found return -1
        return -1;
        
    }
    //Time Complexity : o(Log N)
    //Space Complexity: o(1)
}
