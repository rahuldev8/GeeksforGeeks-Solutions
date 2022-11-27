/*
Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

 

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
 

Example 2:

Input:
n = 5
A[] = {1,2,3,4,0}
Output: 4 0

*/

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> ar = new ArrayList<>();
        
        int r_max = arr[n-1];
        ar.add(r_max);
        
        //comparing the array backwards and updating value of r_max, the value of current
        //element is greater than that....
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i] >= r_max)
            {
                ar.add(arr[i]);
                r_max = arr[i];
            }
        }
        Collections.reverse(ar);
        return ar;
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
    }
}
