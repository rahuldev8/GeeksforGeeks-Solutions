/*
Given an array A[] of N elements. The task is to count number of even and odd elements in the array.

Example:

Input:
N = 5
A[] = 1 2 3 4 5
Output:
3 2
Explanation:
There are 3 odd elements (1, 3, 5)
and 2 even elements (2 and 4).*/


class Solution
{
    public void countOddEven(int[] arr, int n)
    {
        // Code here
        int odd = 0,even=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2 == 0) even++;
            else odd++;
        }
        System.out.println(odd+" "+even);
    }
}
