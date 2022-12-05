/*
Write a program to Validate an IPv4 Address.
According to Wikipedia, IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255, separated by dots, e.g., 172.16.254.1 .
A valid IPv4 Address is of the form x1.x2.x3.x4 where 0 <= (x1, x2, x3, x4) <= 255.
Thus, we can write the generalized form of an IPv4 address as (0-255).(0-255).(0-255).(0-255).
Note: Here we are considering numbers only from 0 to 255 and any additional leading zeroes will be considered invalid.

Your task is to complete the function isValid which returns 1 if the given IPv4 address is valid else returns 0. The function takes the IPv4 address as the only argument in the form of string.

Example 1:

Input:
IPv4 address = 222.111.111.111
Output: 1
Explanation: Here, the IPv4 address is as
per the criteria mentioned and also all
four decimal numbers lies in the mentioned
range.

Example 2:

Input:
IPv4 address = 5555..555
Output: 0
Explanation: 5555..555 is not a valid
IPv4 address, as the middle two portions
are missing.
*/
class Solution {

    public boolean isValid(String s) {
        // Write your code here
        
        //If last char is . return false
        if(s.charAt(s.length()-1)=='.')return false;
        
        //if two dots coming consectively false
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='.' && s.charAt(i-1)=='.') return false;
        }
        //new string array, splitting with respect to .
        String[] str=s.split("[.]");
        //if new array size is not 4, it has to be 4, return false
        if(str.length!=4) return false;
        
        //iterate through the each octets
        for(int i=0;i<str.length;i++){
            //if a octet starting with 0, return false
            if(str[i].charAt(0)=='0'&& str[i].length()!=1) return false;
            //if there is any character, other than lowercase, return false
            if(str[i].charAt(0)>='a' && str[i].charAt(0)<='z' )  return false;
            //convert string to int
            int num=Integer.parseInt(str[i]);
            //if its valid octect, check the next
            if(num>=0 && num<=255){
                continue;
            }
            //else false
            else return false;
        }
        //if all conditions are true, return true
        return true;
    }
}
