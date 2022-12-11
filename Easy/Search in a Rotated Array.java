/*
Given a sorted and rotated array A of N distinct elements which is rotated at some point, and given an element key. The task is to find the index of the given element key in the array A.

Example 1:

Input:
N = 9
A[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}
key = 10
Output:
5
Explanation: 10 is found at index 5.
Example 2:

Input:
N = 4
A[] = {3, 5, 1, 2}
key = 6
Output:
-1
Explanation: There is no element that has value 6.

*/

class Solution
{
    int search(int A[], int l, int h, int key)
    {
        //Binary Search
        int start = 0;
        int end = A.length-1;
        
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            //case 1 : if target found retur its index
            if(key==A[mid])return mid;
            //case 2 : if left array is sorted
            if(A[start] <= A[mid])
            {
                //if key in in sorted range
                if(key >= A[start] && key <= A[mid])
                    end = mid -1;
                else
                    start = mid + 1;
            }
            //case 3 : if right array is sorted
            else
            {
                //if key is present in given range
                if(key >= A[mid] && key <= A[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
        
        //Time Complexity : o(log N)
        //Space Complexity : o(1)
    }
}
