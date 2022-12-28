/*
Dilpreet wants to paint his dog's home that has n boards with different lengths. The length of ith board is given by arr[i] where arr[] is an array of n integers. He hired k painters for this work and each painter takes 1 unit time to paint 1 unit of the board. 

The problem is to find the minimum time to get this job done if all painters start together with the constraint that any painter will only paint continuous boards, say boards numbered {2,3,4} or only board {1} or nothing but not boards {2,4,5}.


Example 1:

Input:
n = 5
k = 3
arr[] = {5,10,30,20,15}
Output: 35
Explanation: The most optimal way will be:
Painter 1 allocation : {5,10}
Painter 2 allocation : {30}
Painter 3 allocation : {20,15}
Job will be done when all painters finish
i.e. at time = max(5+10, 30, 20+15) = 35
Example 2:

Input:
n = 4
k = 2
arr[] = {10,20,30,40}
Output: 60
Explanation: The most optimal way to paint:
Painter 1 allocation : {10,20,30}
Painter 2 allocation : {40}
Job will be complete at time = 60
*/

 class Solution{
    static boolean IsPaintingPossible(int[] arr, int n, int k, long Maxtime)
    {
        //to get job done, we need atleat one painter
        int painters = 1;
        long CurrTime = 0;
        
        for(int i=0; i<n; i++)
        {
            //Let's say, if the time required for a single board, is more than maximum alloted time
            if(arr[i]>Maxtime)return false;
            //if Maxtime for a particular painters gets over, we need another painter
            if(arr[i]+CurrTime > Maxtime)
            {
                painters++;
                //if currPainter count crosses the given limit, the partition not possible
                if(painters>k)return false;
                CurrTime = arr[i];
            }
            //else add time to painter
            else
                CurrTime += arr[i];
        }
        
        return true;
    }
    static long minTime(int[] arr,int n,int k){
        //Edge Case, if No of Painters are more than given boards (Not Applicable)
        //if(k>n)return (long)-1;
        
        //Binary Search
        long res = Integer.MAX_VALUE;
        
        //Search space, max length of given boards
        long start = Integer.MIN_VALUE;
        //sum of all given boards
        long end = 0;
        for(int i:arr)
        {
            start = Math.max(start, i);
            end += i;
        }
        
        while(start<=end)
        {
            long mid = start+(end-start)/2;
            //checking if painting can be done in middle time
            if(IsPaintingPossible(arr, n, k, mid))
            {
                res = Math.min(res, mid);
                end = mid-1;
            }
            //time is not sufficient, so Increase the time
            else
                start = mid+1;
        }
        
        return res;
        //Time Complexity : O(N log N)
        //Space Complexity : O(1)
    }
}
