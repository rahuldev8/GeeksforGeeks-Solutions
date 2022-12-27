/*
Given two sorted arrays array1 and array2 of size m and n respectively. Find the median of the two sorted arrays.

Example 1:

Input:
m = 3, n = 4
array1[] = {1,5,9}
array2[] = {2,3,6,7}
Output: 5
Explanation: The middle element for
{1,2,3,5,6,7,9} is 5
Example 2:

Input:
m = 2, n = 4
array1[] = {4,6}
array2[] = {1,2,3,5}
Output: 3.5
*/

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        //Binary Search
        if(n>m) return medianOfArrays(m, n, b, a);
        
        int start = 0;
        int end = n;
        
        while(start<=end)
        {
            int cut1 = start+(end-start)/2;
            int cut2 = (n+m)/2 - cut1;
            
            int l1 = cut1==0?Integer.MIN_VALUE:a[cut1-1];
            int l2 = cut2==0?Integer.MIN_VALUE:b[cut2-1];
            
            int r1 = cut1==n?Integer.MAX_VALUE:a[cut1];
            int r2 = cut2==m?Integer.MAX_VALUE:b[cut2];
            
            //logic l1<r2 && l2<r1 
            if(l1>r2)
                end = cut1-1;
            else if(l2>r1)
                start = cut1+1;
                
            else
            {
                //if merged array is even
                if((n+m)%2==0)
                    return (Math.max(l1, l2) + Math.min(r1, r2))/2.0;
                else
                 return Math.min(r1, r2);
            }
        }
        return 0.0;
    }
}
