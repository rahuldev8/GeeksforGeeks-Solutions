/*
Given an array arr[] of distinct integers of size N and a value sum, the task is to find the count of triplets (i, j, k), having (i<j<k) with the sum of (arr[i] + arr[j] + arr[k]) smaller than the given value sum.


Example 1:


Input: N = 4, sum = 2
arr[] = {-2, 0, 1, 3}
Output:  2
Explanation: Below are triplets with 
sum less than 2 (-2, 0, 1) and (-2, 0, 3). 
*/
class Solution
{
    long countTriplets(long nums[], int n,int sum){
        long triplets = 0;
        Arrays.sort(nums);
        
        for(int i=0; i<n-2; i++){
            int start = i+1;
            int end = n-1;
            
            while(start <= end){
                long Current = nums[i] + nums[start] + nums[end];
                
                if(Current < sum){
                    triplets += (end - start);
                    start++;
                }
                else{
                    //Current > sum
                    end--;
                }
            }
        }
        return triplets;
    }
    //Time Complexity :O(n^2) + O(n log N)
    //Space Complexity : O(1)
}
