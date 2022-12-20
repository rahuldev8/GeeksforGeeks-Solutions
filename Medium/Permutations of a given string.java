/*
Given a string S. The task is to print all unique permutations of the given string in lexicographically sorted order.

 

Example 1:

Input: ABC
Output:
ABC ACB BAC BCA CAB CBA
Explanation:
Given string ABC has permutations in 6 
forms as ABC, ACB, BAC, BCA, CAB and CBA .
Example 2:

Input: ABSG
Output:
ABGS ABSG AGBS AGSB ASBG ASGB BAGS 
BASG BGAS BGSA BSAG BSGA GABS GASB 
GBAS GBSA GSAB GSBA SABG SAGB SBAG 
SBGA SGAB SGBA
Explanation:
Given string ABSG has 24 permutations.
*/

class Solution {
    public void backtrack(String S, List<String> result, String temp)
    {
        //if given string length becomes zero (bcoz we are extracting each elements and adding to temp)
        //&& if result should not contain temp string
        if(S.length()==0 && !result.contains(temp))
        {
            result.add(temp);
            return;
        }
        //for new string traverse from start to end
        for(int i=0; i<S.length(); i++)
        {
            //extract the i'th element from string
            char ch = S.charAt(i);
            //new string to be passed excluding the i'th character
            String perm = S.substring(0,i)+S.substring(i+1);
            //backtrack function call, with new String and new temp string
            backtrack(perm, result, temp+ch);
        }
    }
    public List<String> find_permutation(String S) {
        //Back Track Method
        
        List<String> result = new ArrayList<>();
        //helper function call to perform permuations
        backtrack(S, result,"");
        //Since question demands lexicographically sorted order
        Collections.sort(result);
        
        return result;
        
        //Time Complexity : o(n* n!)
        //Space Complexity : o(n)
    }
}
