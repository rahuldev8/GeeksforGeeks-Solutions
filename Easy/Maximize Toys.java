/*
Given an array arr[ ] of length N consisting cost of N toys and an integer K depicting the amount with you. Your task is to find maximum number of toys you can buy with K amount. 

Example 1:

Input: 
N = 7 
K = 50
arr[] = {1, 12, 5, 111, 200, 1000, 10}
Output: 4
Explaination: The costs of the toys 
you can buy are 1, 12, 5 and 10.
Example 2:

Input: 
N = 3 
K = 100
arr[] = {20, 30, 50}
Output: 3
Explaination: You can buy all toys.
*/

class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        //passing the input array to priority queue which default implements min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i : arr)
            pq.add(i);
        //count of toys we can buy
        int count = 0;
        
        //K is remaining the amount that must not be negative &&
        // min heap should not be empty &&
        //top elemnt in heap (currently available min) should not greater than K
        while(K>=0 && !pq.isEmpty() && pq.peek()<=K)
        {
            K = K - pq.poll();
            count++;
        }
        
        return count;
        //Time Complexity : o(n)
        //Space Complexity : o(n)
    }
}
