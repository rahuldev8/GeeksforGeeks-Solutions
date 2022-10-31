/*
Given two strings a and b consisting of lowercase characters. 
The task is to check whether two given strings are an anagram of each other or not. 
An anagram of a string is another string that contains the same characters, only the order of characters can be different. 
For example, act and tac are an anagram of each other.

Example 1:

Input:a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same characters with
        same frequency. So, both are anagrams.
   */


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        int[] hash = new int[26];
        for(int i=0;i<a.length();i++)
        {
            hash[a.charAt(i)-'a']++;
        }
        
        for(int i=0;i<b.length();i++)
        {
            hash[b.charAt(i)-'a']--;
        }
        
        for(int i=0;i<25;i++)
        {
            if(hash[i]!=0)return false;
        }
        return true;
        
        // Your code here
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
