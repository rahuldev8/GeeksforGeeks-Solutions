/*
Print numbers from N to 1 (space separated) without the help of loops.

Example 1:

Input:
N = 10
Output: 10 9 8 7 6 5 4 3 2 1

*/

class Solution {

    void printNos(int N) {
        // code here
        if(N==0)
        return;
        
        System.out.print(N+" ");
        printNos(N-1);
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
        
    }
}
