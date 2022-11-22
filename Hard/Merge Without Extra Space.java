/*
Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order without using any extra space. Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.
 

Example 1:

Input: 
n = 4, arr1[] = [1 3 5 7] 
m = 5, arr2[] = [0 2 6 8 9]
Output: 
arr1[] = [0 1 2 3]
arr2[] = [5 6 7 8 9]
Explanation:
After merging the two 
non-decreasing arrays, we get, 
0 1 2 3 5 6 7 8 9.
Example 2:

Input: 
n = 2, arr1[] = [10, 12] 
m = 3, arr2[] = [5 18 20]
Output: 
arr1[] = [5 10]
arr2[] = [12 18 20]
Explanation:
After merging two sorted arrays 
we get 5 10 12 18 20.
*/


/*Approach 1 :
-------------
*/

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        
        //creating a temp array
        long[] temp = new long[n+m];
        
        //copying all elements to temp array
        for(int i=0;i<n;i++)
        {
            temp[i] = arr1[i];
        }
        
        for(int i=n;i<n+m;i++)
        {
            temp[i] = arr2[i-n];
        }
        
        //sorting the whole array
        Arrays.sort(temp);
        
        //overwriting the input array in ascending order as question demands
        for(int i=0;i<n;i++)
        {
            arr1[i] = temp[i];
        }
        
        for(int i=0;i<m;i++)
        {
            arr2[i] = temp[i+n];
        }
        
        //Time Complexity : o(n log n)
        //Space Complexity: o(n)
    }
}
