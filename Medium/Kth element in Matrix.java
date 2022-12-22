/*
Given a N x N matrix, where every row and column is sorted in non-decreasing order. Find the kth smallest element in the matrix.

Example 1:
Input:
N = 4
mat[][] =     {{16, 28, 60, 64},
                   {22, 41, 63, 91},
                   {27, 50, 87, 93},
                   {36, 78, 87, 94 }}
K = 3
Output: 27
Explanation: 27 is the 3rd smallest element.
 

Example 2:
Input:
N = 4
mat[][] =     {{10, 20, 30, 40}
                   {15, 25, 35, 45}
                   {24, 29, 37, 48}
                   {32, 33, 39, 50}}
K = 7
Output: 30
Explanation: 30 is the 7th smallest element.
*/

class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
        //Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
            {
                pq.add(mat[i][j]);
                //heap size exceeds k, delete largest element from heap
                if(pq.size()>k)
                    pq.poll();
            }
        }
        //return the root of heap, which is kth smallest element
        return pq.peek();
        
        //Time Complexity : O(n log n) opeartion on heap takes log n time
        //Space Complexity : o(k) size of heap
    }
}
