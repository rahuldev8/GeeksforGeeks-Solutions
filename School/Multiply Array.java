/*
Calculate the product of all the elements in an array.

Example 1:

Input:
5
1 2 3 4 5
Output:
120
 

Example 2:

Input:
10
5 5 5 5 5 5 5 5 5 5
Output:
9765625
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function product() which takes the array Arr[] and its size N as inputs and returns the product of all elements.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

Constraints:
1  ≤  N  ≤  10
1  ≤  A[i]  ≤  5
*/

class Solution {

    public static int product(int arr[],int n)
    {
        int ans = 1;
        for(int i=0;i<n;i++)
        {
            ans *= arr[i];
        }
        return ans;
    }
}
