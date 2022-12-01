/*
Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).

 

Example 1:

Input:
x = 5
Output: 2
Explanation: Since, 5 is not a perfect 
square, floor of square_root of 5 is 2.
Example 2:

Input:
x = 4
Output: 2
Explanation: Since, 4 is a perfect 
square, so its square root is 2.
*/

class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		
		//Just Taking Squre root for given Number and 
		//Appyling floor function to it
		//Type casting it to long, since function return type is same
		return (long)Math.floor(Math.sqrt(x*1.0));
		
		//Time Complexity : o(1)
		//Space Complexity : o(1)
	 }
}
