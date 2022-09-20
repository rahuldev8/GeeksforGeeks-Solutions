/*
Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and asked him to build a pattern.

Help Geek to build the pattern.

 

Example 1:

Input: 5

Output:
ABCDE
ABCD
ABC
AB
A*/

class Solution {

    void printTriangle(int n) {
        for (int i=0;i<n;i++)
        {
            char ans = 'A';
            for(int j=i+1;j<=n;j++)
            {
                System.out.print(ans);
                ans++;
            }
            System.out.println();
        }
        // code here
    }
}
