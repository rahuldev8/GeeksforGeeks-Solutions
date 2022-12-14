/*
Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.

Example 1:

Input:
N = 6, X = 16
Arr[] = {1, 4, 45, 6, 10, 8}
Output: Yes
Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
Example 2:

Input:
N = 5, X = 10
Arr[] = {1, 2, 4, 3, 6}
Output: Yes
Explanation: Arr[2] + Arr[4] = 4 + 6 = 10
*/

class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        boolean flag = false;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            int comp = x - arr[i];
            //checking the number which adds upto comp to get x
            if(map.containsKey(comp))
            {
                flag = true;
                break;
            }
            //else put them in map
            else
                map.put(arr[i],i);
        }
        return flag;
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
    }
}
