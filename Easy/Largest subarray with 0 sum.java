/*
Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

Example 1:

Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with
sum 0 will be -2 2 -8 1 7.
*/

class GfG
{
    int maxLen(int arr[], int n)
    {
        int prefix = 0;
        int result = 0;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<n; i++)
        {
            prefix += arr[i];
            //if subarray found within using prefix only
            if(prefix==0)
                result = i+1;
            else
            {
                //check for if same prefix found in map, if so subract current i - previous 
                //same prefix index
                if(map.containsKey(prefix))
                    result = Math.max(result, i-map.get(prefix));
                //else add the entry to map
                else
                    map.put(prefix, i);
            }
        }
        return result;
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
    }
}
