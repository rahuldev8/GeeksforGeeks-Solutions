/*
Given a non-negative number represented as a list of digits, add 1 to the number (increment the number represented by the digits). The digits are stored such that the most significant digit is first element of array.
 

Example 1:

Input: 
N = 3
arr[] = {1, 2, 4}
Output: 
1 2 5
Explanation:
124+1 = 125, and so the Output
Example 2:

Input: 
N = 3
arr[] = {9,9,9}
Output: 
1 0 0 0
Explanation:
999+1 = 1000, and so the output
*/
class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        
        //from last if any number is less than 9, then increment it
        for(int i=N-1; i>=0; i--)
        {
            //Example:
            //if input is [4,5,3,6,7]
            //output will be [4,5,3,6,8] abd return it there itself
            if(arr.get(i)<9)
            {
                arr.set(i, arr.get(i)+1);
                return arr;
            }
            //else replace the value with 0
            else 
            arr.set(i,0);
        }
        //add 1 in list at 0th index
        arr.add(0,1);
        return arr;
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
};
