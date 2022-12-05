/*
Given a string, Your task is to  complete the function encode that returns the run length encoded string for the given string.
eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
You are required to complete the function encode that takes only one argument the string which is to be encoded and returns the encoded string.

Example 1:

Input:
str = aaaabbbccc
Output: a4b3c3
Explanation: a repeated 4 times
consecutively b 3 times, c also 3
times.
Example 2:

Input:
str = abbbcdddd
Output: a1b3c1d4

*/

class GfG
 {
	String encode(String str)
	{
          //String length
          int n = str.length();
          
          
          String ans ="";
          
          //traversing througth the whole string
          for(int i=0;i<n;i++)
          {
              //tracking count of current character
            int count = 1;
            //till string is finished and the curr and next char is same increment the count.
            while(i<n-1 && str.charAt(i)==str.charAt(i+1))
                {
                    count++;
                    i++;
                }
           //appending the char and its count to final string ("" empty sting included to behave as string)
            ans = ans + (str.charAt(i)+""+count);
          }
            return ans;
            
            
            //Time Complexity : o(n)
            //Space Complexity : o(1)
	}
	
 }
