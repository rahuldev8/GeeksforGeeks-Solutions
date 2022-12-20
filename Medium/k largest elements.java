/*
Given an array Arr of N positive integers and an integer K, find K largest elements from the array.  The output elements should be printed in decreasing order.

Example 1:

Input:
N = 5, K = 2
Arr[] = {12, 5, 787, 1, 23}
Output: 787 23
Explanation: 1st largest element in the
array is 787 and second largest is 23.
Example 2:

Input:
N = 7, K = 3
Arr[] = {1, 23, 12, 9, 30, 2, 50}
Output: 50 30 23
Explanation: 3 Largest element in the
array are 50, 30 and 23.
*/

class Solution {
    //own reverse logic
    void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end)
        {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
    int[] kLargest(int[] arr, int n, int k) {
        //Using Min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] ans = new int[k];
        
        //add first k elements to min heap
        for(int i=0; i<k; i++)
            pq.add(arr[i]);
        
        //check balance elements
        for(int i=k; i<n; i++)
        {
            if(arr[i]>pq.peek())
            {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        
        //populate the array with heap contents
        for(int i=0; i<k; i++)
            ans[i] = pq.poll();
        
        reverse(ans); 
        return ans;
        
        //Time Complexity : o(n*logn)
        //Space Complexity : o(k)
    }
}
