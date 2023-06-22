/*
Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.


Example 1:

Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in 
the array sums up to 13.
*/
class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int nums[], int n, int target) { 
       Arrays.sort(nums);
       
       for(int i=0; i<nums.length-2; i++){
           int start = i+1;
           int end = nums.length-1;
           
           while(start < end){
               int Sum = nums[i] + nums[start] + nums[end];
               if(Sum == target)
                    return true;
                else if(Sum < target)
                    start++;
                else
                    end--;
           }
       }
       return false;
    
    }
}
