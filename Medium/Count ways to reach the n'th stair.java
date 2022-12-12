/*
There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top (order does matter).

Example 1:

Input:
n = 4
Output: 5
Explanation:
You can reach 4th stair in 5 ways. 
Way 1: Climb 2 stairs at a time. 
Way 2: Climb 1 stair at a time.
Way 3: Climb 2 stairs, then 1 stair
and then 1 stair.
Way 4: Climb 1 stair, then 2 stairs
then 1 stair.
Way 5: Climb 1 stair, then 1 stair and
then 2 stairs.
Example 2:

Input:
n = 10
Output: 89 
Explanation: 
There are 89 ways to reach the 10th stair.
*/

class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        
        if(n<=2)return n;
        
        //Fibonacci series, using Dynamic programming
        int[] cache = new int[n+1];
        cache[1] = 1;
        cache[2] = 2;
        
        for(int i=3; i<=n; i++)
        {
            cache[i] = cache[i-1] + cache[i-2];   
            cache[i] %= 1000000007;
        }
        return cache[n];
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
    }
}
