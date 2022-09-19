/*
Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and asked him to build a pattern.

Help Geek to build the pattern.*/

class Solution {

    void printTriangle(int n) {
        
        for(int i=0;i<n;i++)
        {
            char ans ='A';
            for(int j=1;j<=i+1;j++)
            {
                System.out.print(ans);
                ans++;
            }
            System.out.println();
        }
    }
}
