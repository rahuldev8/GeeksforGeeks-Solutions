/*
Given a number N. Find the length of the longest consecutive 1s in its binary representation.

Example 1:

Input: N = 14
Output: 3
Explanation: 
Binary representation of 14 is 
1110, in which 111 is the longest 
consecutive set bits of length is 3.
Example 2:

Input: N = 222
Output: 4
Explanation: 
Binary representation of 222 is 
11011110, in which 1111 is the 
longest consecutive set bits of length 4. 

*/

class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N) {
        
        // convery=ting given decimal to binary
        String bin = Integer.toBinaryString(N);
        int count = 0;
        int ans = 0;
        
        //int temp = Integer.parseInt(bin);
        
        for(int i=0;i<bin.length();i++)
        {
            //if 0 encountered, reset count value to 0
            if(bin.charAt(i)=='0')
                count=0;
            //else ++    
            else count++;
            
            //Store to ans, if it is max
            ans = Math.max(ans, count);
        }
        
        return ans;
        
        //Time Complexity : o(n)
        //Space Complexity : o(1)
        
    }
}
