/*
You are given an array of N integers arr, find the count of reverse pairs. 

A pair of indices (i, j) is said to be a reverse pair if both the following conditions are met:

0 <= i < j < N 
arr[i] > 2 * arr[j]
Example 1:
Input:
N = 6
arr = [3, 2, 4, 5, 1, 20]
Output:
3
Explanation:
The Reverse pairs are 
(i)  (0, 4), arr[0] = 3, arr[4] = 1, 3 > 2(1) 
(ii) (2, 4), arr[2] = 4, arr[4] = 1, 4 > 2(1) 
(iii)(3, 4), arr[3] = 5, arr[4] = 1, 5 > 2(1) 
*/

class Solution {
    public int merge(int[] arr, int start, int mid, int end){
        int i = start, j = mid+1, k = 0;
        int[] buffer = new int[end-start+1];
        
        //logic to calculate the pairs from left and right part of arrays
        int pairs = 0;
        int right = mid+1;
        for(int left = start; left<=mid; left++){
            //right index must be less than end && arr[i] > arr[j]*2
            while(right <= end && arr[left] > arr[right]*2)
                right++;
            //adding left part of right array count to answer
            pairs+=(right-(mid+1));    
        }
        
        while(i<=mid && j<=end){
            if(arr[i] < arr[j]){
                buffer[k++] = arr[i++];
            }else{
                buffer[k++] = arr[j++];
            }
        }
        
        while(i<=mid){
            buffer[k++] = arr[i++];
        }
        
        while(j<=end){
            buffer[k++] = arr[j++];
        }
        
        //copying back to original array
        for(int x=0; x<buffer.length; x++){
            arr[x+start] = buffer[x];
        }
        
        return pairs;
    }
    public int mergeSort(int[] arr, int start, int end){
        //recursive base condition
        if(start>=end)
            return 0;
        
        int mid = start+(end - start)/2;
        
        int right = mergeSort(arr, start, mid);
        int left = mergeSort(arr, mid+1, end);
        
        int pairs = merge(arr, start, mid, end);
        
        return pairs+left+right;
    }
    public int countRevPairs(int N, int arr[]) {
        int result = mergeSort(arr, 0, N-1);
        return result;
    }
    
    //Time Complexity : O(N log N) --> Modified merge sort
    //Space Complexity : O(N)  --> Recursive stack space
}
