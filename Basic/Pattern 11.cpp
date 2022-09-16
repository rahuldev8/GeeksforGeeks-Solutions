/*
Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and asked him to build a pattern.

Help Geek to build a star pattern.

 

Example 1:

Input: 5

Output:
1 
0 1 
1 0 1
0 1 0 1 
1 0 1 0 1
*/

class Solution {
  public:
    void printTriangle(int n) {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                cout<<(i+j+1)%2<<" ";
            }
            cout<<endl;
        }
        // code here
    }
};
