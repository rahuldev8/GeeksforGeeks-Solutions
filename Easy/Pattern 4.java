/*
Geek is very fond of patterns. Once, his teacher gave him a  pattern to solve. He gave Geek an integer n and asked him to build a pattern.

Help Geek to build a pattern.*/

class Solution {

    void printTriangle(int n) {
        // code here
        int ans = 1;
        for (int i=0;i<n;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print(ans+ " ");
            }
            System.out.println();
            ans++;
        }
    }
}
