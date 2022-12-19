/*
Given an n-digit large number in form of string, check whether it is divisible by 7 or not. Print 1 if divisible by 7, otherwise 0.


Example 1:

Input: num = "8955795758"
Output: 1
Explanation: 8955795758 is divisible
by 7.
Example 2:

Input: num = "1000"
Output: 0
Explanation: 1000 is not divisible
by 7.
*/
class Solution{
    int isdivisible7(String num){
        // code here
        
        int remainder = 0;
        
        for(int i=0; i<num.length(); i++)
        {
            remainder = (remainder*10) + (num.charAt(i)-'0');
            remainder %= 7;
        }
        
        return remainder==0?1:0;
        
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
