/*
You are given N number of books. Every ith book has Ai number of pages. 
You have to allocate contiguous books to M number of students. There can be many ways or permutations to do so. In each permutation, one of the M students will be allocated the maximum number of pages. Out of all these permutations, the task is to find that particular permutation in which the maximum number of pages allocated to a student is the minimum of those in all the other permutations and print this minimum value.

Each book will be allocated to exactly one student. Each student has to be allocated at least one book.

Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).

 

Example 1:

Input:
N = 4
A[] = {12,34,67,90}
M = 2
Output:113
Explanation:Allocation can be done in 
following ways:{12} and {34, 67, 90} 
Maximum Pages = 191{12, 34} and {67, 90} 
Maximum Pages = 157{12, 34, 67} and {90} 
Maximum Pages =113. Therefore, the minimum 
of these cases is 113, which is selected 
as the output.

Example 2:

Input:
N = 3
A[] = {15,17,20}
M = 2
Output:32
Explanation: Allocation is done as
{15,17} and {20}
*/

class Solution 
{
    //Function to finf if books can be allocated for given maxValue
    public static boolean AllocationPossible(int[] A, int N, int M, int maxPages)
    {
        //we need atleast a student, incase books need to be allocated
        int stud = 1;
        //to keep track of current pages for each student
        int currPages = 0;
        
        for(int i=0; i<N; i++)
        {
            //if book pages is greater than maxPages, then definetly allocation is not possible
            if(A[i]>maxPages)return false;
            
            //if maxPage limit for a particular student crosses, increase the number of students
            if(A[i]+currPages > maxPages)
            {
                stud++;
                //checking the student limit
                if(stud>M)return false;
                //updating current Page count for new Student
                currPages = A[i];
            }
            else
            //still not crossesd the maxPage limit, so we can continue to add the books
            currPages += A[i];
        }
        return true;
    }
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Edge Case
        //What if? Number of students is greater than, number of available books
        if(M>N)return -1;
        
        int res = Integer.MAX_VALUE;
        //since,one of the M students will be allocated the maximum number of pages
        int start = Integer.MIN_VALUE;
        //the highest possible value will be sum of given number of pages
        int end = 0;
        for(int i:A)
        {
            start = Math.max(start, i);
            end += i;
        }
        
        while(start<=end)
        {
            int mid = start+(end-start)/2;//max books a student can get
            //if Aloocation is possible for current max books value, try to reduce the values
            if(AllocationPossible(A, N, M, mid))
            {
                res = Math.min(res, mid);
                end = mid-1;
            }
            //else increase the value
            else
                start = mid+1;
        }
        return res;
        //Time Complexity : O(N log N)
        //Space Complexity : O(1)
    }
};
