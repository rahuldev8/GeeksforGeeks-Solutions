/*
Given two sequences, find the length of longest subsequence present in both of them. Both the strings are of uppercase.

Example 1:

Input:
A = 6, B = 6
str1 = ABCDGH
str2 = AEDFHR
Output: 3
Explanation: LCS for input Sequences
“ABCDGH” and “AEDFHR” is “ADH” of
length 3.
Example 2:

Input:
A = 3, B = 2
str1 = ABC
str2 = AC
Output: 2
Explanation: LCS of "ABC" and "AC" is
"AC" of length 2.


*/

// } Driver Code Ends


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    public static int max(int a,int b)
    {
        return a>b ? a : b; 
    }
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int[][] lcs = new int[x+1][y+1];
        
        for(int i=0;i<=x;i++)
        {
            for(int j=0;j<=y;j++)
            {
                if(i == 0 || j == 0) lcs[i][j] = 0;
                
                else if(s1.charAt(i-1) == s2.charAt(j-1))
                    lcs[i][j] = 1 + lcs[i-1][j-1];
                    
                else
                    lcs[i][j] = max(lcs[i-1][j], lcs[i][j-1]);
            }
        }
        return lcs[x][y];
        
        //Time Complexity : o(n*m)
        //Space Complexity : o(n*m)
    }
    
}
