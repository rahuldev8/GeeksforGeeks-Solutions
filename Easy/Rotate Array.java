/*
Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise direction) by D steps, where D is a positive integer. 

 

Example 1:

Input:
N = 5, D = 2
arr[] = {1,2,3,4,5}
Output: 3 4 5 1 2
Explanation: 1 2 3 4 5  when rotated
by 2 elements, it becomes 3 4 5 1 2.
Example 2:

Input:
N = 10, D = 3
arr[] = {2,4,6,8,10,12,14,16,18,20}
Output: 8 10 12 14 16 18 20 2 4 6
Explanation: 2 4 6 8 10 12 14 16 18 20 
when rotated by 3 elements, it becomes 
8 10 12 14 16 18 20 2 4 6.
*/

class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    
    static void reverse(int arr[], int start, int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
    static void rotateArr(int arr[], int d, int n)
    {
        //For effective Roations
        d = d %n;
        
        //reverse the first d-1 elements
        reverse(arr, 0, d-1);
        //reverse the next d elements
        reverse(arr, d, n-1);
        //reverse the whole array
        reverse(arr, 0, n-1);

    }
    //Time Complexity : o(n)
    //Space Complexity : o(1)
}
