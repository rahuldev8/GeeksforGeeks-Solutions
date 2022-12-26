/*
Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower either by increasing or decreasing them by K only once.
Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.
Note: Assume that height of the tower can be negative.
A slight modification of the problem can be found here. 


Example 1:

Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as 
{3, 3, 6, 8}. The difference between 
the largest and the smallest is 8-3 = 5.
Example 2:

Input:
K = 3, N = 5
Arr[] = {3, 9, 12, 16, 20}
Output:
11
Explanation:
The array can be modified as
{6, 12, 9, 13, 17}. The difference between 
the largest and the smallest is 17-6 = 11.
*/

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        //Idea is sort array and get difference between higher and lower values
        Arrays.sort(arr);
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int diff = arr[n-1]-arr[0];
        
        for(int i=1; i<n; i++)
        {
            //max will LARGEST Elements's value - k for every iteration, with curr elem +k
            max = Math.max(arr[i-1]+k, arr[n-1]-k);
            
            //min will SMALLEST Elements's value + k for every iteration, with curr elem -k
            min = Math.min(arr[i]-k, arr[0]+k);
            
            //we want Min diff
            diff = Math.min(diff, max-min);
        }
        
        return diff;
        //Time Complexity : O(n log N)
        //Space Complexity : O(1)
    }
}
