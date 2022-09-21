/*
Given an array A of size N of integers. Your task is to find the sum of minimum and maximum elements in the array.

 

Example 1:

Input:
N = 5
A[] = {-2, 1, -4, 5, 3}
Output: 1
Explanation: min = -4, max =  5. Sum = -4 + 5 = 1*/


class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<N-1;i++)
        {
            if(A[i] > max)max = A[i];
            if(A[i] < min)min = A[i];
        }
        return max+min;
    }
}
