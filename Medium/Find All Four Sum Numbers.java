/*
Given an array of integers and another number. Find all the unique quadruple from the given array that sums up to the given number.

Example 1:

Input:
N = 5, K = 3
A[] = {0,0,2,1,1}
Output: 0 0 1 2 
Explanation: Sum of 0, 0, 1, 2 is equal
to K.
*/

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-3; i++){
            //to eliminate duplicate elements
            if(i>0 && nums[i] == nums[i-1])
                continue;
            for(int j=i+1; j<n-2; j++){
                if(j > i+1 && nums[j] == nums[j-1])
                    continue;
                    
                int start = j+1, end = n-1;
                while(start < end){
                    long curr = nums[i] + nums[j] + nums[start] + nums[end];
                    
                    if(curr == target){
                        result.add(new ArrayList<Integer> (Arrays.asList(nums[i], nums[j], nums[start], nums[end])));
                        
                        //to eliminate duplicates
                        while(start<end && nums[start] == nums[start+1])
                            start++;
                        while(start<end && nums[end] == nums[end-1])
                            end--;
                        
                        //to Avoid TLE
                        start++;
                        end--;
                    }
                    else if(curr < target)
                        start++;
                    else
                        end--;
                }
            }    
        }
        return result;
        //Time Complexity : O(n^3) + O(n log n)
        //Space Complexity : O(n)
    }
}
