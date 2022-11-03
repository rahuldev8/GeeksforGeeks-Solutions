/*
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.

*/

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int zc = 0,oc=0;// takes zero and one count 
        
        for(int i=0;i<n;i++)//counting values
        {
            if(a[i]==0)zc++;
            if(a[i]==1)oc++;
        }
        for(int i=0;i<zc;i++)//from zero to zc value, insert 0
            a[i] = 0;
        for(int i=zc;i<zc+oc;i++)//from zc to zc+oc value, insert 1
            a[i] = 1;
        for(int i=zc+oc;i<n;i++)//from zc+oc to n value, insert 2
            a[i]=2;
            
            //Time Complexity : o(n)
            //Space Complexity : o(1)
    }
}
