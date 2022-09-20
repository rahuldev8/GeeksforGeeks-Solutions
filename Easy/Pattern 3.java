/*
Geek is very fond of patterns. Once, his teacher gave him a  pattern to solve. He gave Geek an integer n and asked him to build a pattern.

Help Geek to build a pattern.

 

Example 1:

Input: 5

Output:
1
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
*/

class Solution {

    void printTriangle(int n) {
        for(int i=0;i<n;i++)
        {
            int ans = 1;
            for(int j=1;j<=i+1;j++)
            {
                System.out.print(ans+ " ");
                ans++;
            }
            System.out.println();
        }
        // code here
    }
}
