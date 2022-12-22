/*
Given an array arr[], its starting position l and its ending position r. Sort the array using merge sort algorithm.
Example 1:

Input:
N = 5
arr[] = {4 1 3 9 7}
Output:
1 3 4 7 9
Example 2:

Input:
N = 10
arr[] = {10 9 8 7 6 5 4 3 2 1}
Output:
1 2 3 4 5 6 7 8 9 10
*/
class Solution
{
    void merge(int arr[], int start, int mid, int end)
    {
         int i = start, j = mid+1, k = 0;
         //+1 is beacause end and start are index and we want size
         int[] buffer = new int[end-start+1];
         
         while(i<=mid && j<=end)
         {
             if(arr[i]<=arr[j])
                buffer[k++] = arr[i++];
             else
                buffer[k++] = arr[j++];
         }
         
         //if right part is completed
         while(i<=mid)
            buffer[k++] = arr[i++];
        //if left part is completed
        while(j<=end)
            buffer[k++] = arr[j++];
            
        //copy contents back to arr
        for(int x=0; x<buffer.length; x++)
            arr[x+start] = buffer[x]; 
    }
    void mergeSort(int arr[], int start, int end)
    {
        //base case
        if(start>=end)return;
        
        int mid = start+(end-start)/2;
        
        //divide
        //left part
        mergeSort(arr, start, mid);
        //right part
        mergeSort(arr, mid+1, end);
        
        //conquer part
        merge(arr, start, mid, end);
        
        //Time Complexity : o(n log n)
        //Space Complexity : o(n)
    }
}
