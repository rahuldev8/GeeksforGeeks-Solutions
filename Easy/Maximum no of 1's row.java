/*
Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s.

Example 1:

Input:
N = 3, M = 4
Mat[] = {{0 1 1 1},
         {0 0 1 1},
         {0 0 1 1}}
Output: 0
Explanation: Row 0 has 3 ones whereas
rows 1 and 2 have just 2 ones.

Example 2:

Input: 
N = 2, M = 2
Mat[] = {{0 1},
         {1 1}}
Output: 1
Explanation: Row 1 has 2 ones whereas
row 0 has just a single one. 
*/

class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        for(int j=0; j<M; j++)
        {
            for(int i=0; i<N; i++)
            {
                if(Mat[i][j]==1)
                    return i;
            }
        }
        
        return -1;
    }
}//Time Complexity : O(N log M)
//Space Complexity : O(1)
