/*
Implement the next permutation, which rearranges the list of numbers into Lexicographically next greater permutation of list of numbers. If such arrangement is not possible, it must be rearranged to the lowest possible order i.e. sorted in an ascending order. You are given an list of numbers arr[ ] of size N.

Example 1:

Input: N = 6
arr = {1, 2, 3, 6, 5, 4}
Output: {1, 2, 4, 3, 5, 6}
Explaination: The next permutation of the 
given array is {1, 2, 4, 3, 5, 6}.
Example 2:

Input: N = 3
arr = {3, 2, 1}
Output: {1, 2, 3}
Explaination: As arr[] is the last 
permutation. So, the next permutation 
is the lowest one.
*/

class Solution{
    static void swap(int[] arr, int ind1, int ind2)
    {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
    static void reverse(int[] arr, int start, int end)
    {
        while(start<=end)
            swap(arr, start++, end--);
    }
    static List<Integer> nextPermutation(int N, int arr[]){
        /* 
        Algorithm : 
        1. traverse backwards in given array till -> arr[i] <= arr[i+1] === index1
        2. traverse againg backwards till the point we get arr[j] >= arr[index1] === index2
        3. swap index1 and index2
        4. reverse from index1+1 to last
        */
        
        int i = arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1])
            i--;
        if(i>=0)
        {
            int j = arr.length-1;
            while(arr[i]>=arr[j])
                j--;
            
            swap(arr, i, j);    
        }
        reverse(arr, i+1, arr.length-1);
        
        List<Integer> res = new ArrayList<>();
        for(int x:arr)
            res.add(x);
            
        return res;    
    }//Time Complexity : O(n)
    //Space Complexity : O(1)
}
