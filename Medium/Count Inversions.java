/*
Given an array of integers. Find the Inversion Count in the array. 

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 

Example 1:

Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).
Example 2:

Input: N = 5
arr[] = {2, 3, 4, 5, 6}
Output: 0
Explanation: As the sequence is already 
sorted so there is no inversion count.
Example 3:

Input: N = 3, arr[] = {10, 10, 10}
Output: 0
Explanation: As all the elements of array 
are same, so there is no inversion count.
*/

class Solution
{
    //global static variable
    static long count = 0;
    
    //merge logic array
    static long[] merge(long[] arr1, long[] arr2)
    {
        int i = 0, j = 0, k = 0;
        long[] merged = new long[arr1.length + arr2.length];
        
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
                merged[k++] = arr1[i++];
            else
            {
                merged[k++] = arr2[j++];
                //elements from i to end of left array
                count += arr1.length - i;
            }
        }
        
        while(i<arr1.length)
            merged[k++] = arr1[i++];
        
        while(j<arr2.length)
            merged[k++] = arr2[j++];
            
        //returning the merged array    
        return merged;    
    }
    
    //to divide the array
    static long[] mergeSort(long[] arr, int start, int end)
    {
        //recursive base condition
        if(start>=end)
        {
            long[] base = new long[1];;
            base[0] = arr[start];
            return base;
        }
        
        int mid = start+(end-start)/2;
        //splitting arrays
        long[] left = mergeSort(arr, start, mid);
        long[] right = mergeSort(arr, mid+1, end);
        
        //merging two arrays
        long[] merged_arr = merge(left, right);
        
        return merged_arr;
    }
    static long inversionCount(long arr[], long N)
    {
        count = 0;
        //start and end index in int
        mergeSort(arr, 0, (int)N-1);
        return count;
        
        //Time Complexity : o(n log n)
        //Space Complexity : o(n)
    }
}
