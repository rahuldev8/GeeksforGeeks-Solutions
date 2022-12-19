/*
Given a matrix mat[][] of size N x M, where every row and column is sorted in increasing order, and a number X is given. The task is to find whether element X is present in the matrix or not.


Example 1:

Input:
N = 3, M = 3
mat[][] = 3 30 38 
         44 52 54 
         57 60 69
X = 62
Output:
0
Explanation:
62 is not present in the
matrix, so output is 0

Example 2:

Input:
N = 1, M = 6
mat[][] = 18 21 27 38 55 67
X = 55
Output:
1
Explanation:
55 is present in the
matrix at 5th cell.
*/

class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        int i = 0;//first row
        int j = M-1;//first row last coloumn
        
        while(i<N && j>=0)//till the pointers doesn't cross matrix bounds
        {
            if(mat[i][j]==X)return 1;//if traget found return 1
            
            if(mat[i][j]<X)i++;//if target is larger than curr, check below elements
            else
                j--; //else check, left elements
        }
        return 0;
    }
    
    //Time Complexity : o(n)
    //Space Complexity : o(1)
}
