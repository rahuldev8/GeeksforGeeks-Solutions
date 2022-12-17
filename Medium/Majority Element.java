/*
Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.
 

Example 1:

Input:
N = 3 
A[] = {1,2,3} 
Output:
-1
Explanation:
Since, each element in 
{1,2,3} appears only once so there 
is no majority element.
Example 2:

Input:
N = 5 
A[] = {3,1,3,3,2} 
Output:
3
Explanation:
Since, 3 is present more
than N/2 times, so it is 
the majority element.

*/

class Solution
{
    static int majorityElement(int a[], int size)
    {
        //new Map
        Map<Integer, Integer> map = new HashMap<>();
        
        //populating Map
        for(var i : a)
        {
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
                
            else
                map.put(i, 1);
        }
        //entrySet to iterate over map
        var entrySet = map.entrySet();
        
        //if any element is repeated more than n/2 times return it
        for(var entry : entrySet)
        {
            if(entry.getValue() > size/2) return entry.getKey();
        }
        
        return -1;
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
    }
}
