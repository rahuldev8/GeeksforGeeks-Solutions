/*
The task is to complete the insert() function which is used to implement Insertion Sort.


Example 1:

Input:
N = 5
arr[] = { 4, 1, 3, 9, 7}
Output:
1 3 4 7 9
Example 2:

Input:
N = 10
arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
Output:
1 2 3 4 5 6 7 8 9 10
*/

class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //traverse through the entire array
      for(int i=1; i<n; i++)
      {
          //current element is key
          int key = arr[i];
          //before key is the part where the elemets are properly sorted
          int sorted = i-1;
          
          // sorted should not cross the array's index &&
          // key's previous element should be greater than it
          while(sorted>=0 && arr[sorted]>key)
          {
              //if it is so, copy the last element of sorted to it's next position
              arr[sorted+1] = arr[sorted];
              //decrement sorted
              sorted--;
          }
          arr[sorted+1] = key;
          //Time Complexity : o(n^2)
          //Space Complexity : o(1)
      }
  }
}
