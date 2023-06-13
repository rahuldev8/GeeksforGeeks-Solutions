//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    static void swap(int[] arr, int low, int high)
    {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
    
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        //recursive code to break into partitions
        if(low < high){
            //the index where currently array broken into two sub-problems
            int break_point = partition(arr, low, high);
            
            //solving the right part of pivot element
            quickSort(arr, low, break_point-1);
            
            //solving right part of pivot element
            quickSort(arr, break_point+1, high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        //taking last element as pivot
        int pivot = arr[high];
        
        //pointer to track the elements smaller than pivot
        int smaller = low-1;
        
        for(int i=low; i<high; i++){
            //if current element is smaller than pivot, then swap
            if(arr[i] < pivot){
                smaller++;
                //swapping the smaller element
                swap(arr, smaller, i);
            }
        }
        //finally place the pivot element at it's place
        swap(arr, smaller+1, high);
        
        //return the position of break point
        return smaller+1;
    } 
    //Time Complexity : O(N log N)
    //Space Complexity : O(1)
}
