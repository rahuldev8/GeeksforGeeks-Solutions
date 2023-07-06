/*
Given a string S, find the length of the longest substring without repeating characters.


Example 1:

Input:
S = "geeksforgeeks"
Output:
7
Explanation:
Longest substring is
"eksforg".
*/
class Solution{
    int longestUniqueSubsttr(String S){
        if(S.length()==0)
            return 0;
        int result = Integer.MIN_VALUE;
        int left = 0,right=0;
        Map<Character, Integer> map = new HashMap<>();
        int n = S.length();
        while(right < n){
            //duplicate found in current substring
            if(map.containsKey(S.charAt(right))){
                left = Math.max(left, map.get(S.charAt(right))+1);
            }
            //update index or new entry
            map.put(S.charAt(right), right);
            result = Math.max(result, right-left+1);
            right++;
        }
        return result;
              //Time Complexity : O(n)
        //Space Complexity : O(1)   ---> because the given string 
        //will have only ascii characters limited to 256, 
        //therefore O(256) to be precise  
    }
}
