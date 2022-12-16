/*
Given a string S consisting of lowercase Latin Letters. Return the first non-repeating character in S. If there is no non-repeating character, return '$'.

Example 1:

Input:
S = hello
Output: h
Explanation: In the given string, the
first character which is non-repeating
is h, as it appears first and there is
no other 'h' in the string.
Example 2:

Input:
S = zxvczbtxyzvy
Output: c
Explanation: In the given string, 'c' is
the character which is non-repeating. 
*/
class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Map with char key and int value
        Map<Character, Integer> map = new HashMap<>();
        
        //populating map
        for(Character i : S.toCharArray())
        {
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i,1);
        }
        
        //Iterating over map using string, if value 1 found return that char
        for(Character i : S.toCharArray())
        {
            if(map.get(i)==1)
            return i;
        }
        //else return the required symbol
        return '$';
        //Time Complexity : o(n)
        //Space Complexity : o(n)
    }
}
