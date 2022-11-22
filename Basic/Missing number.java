/*
Vaibhav likes to play with numbers and he has N numbers. One day he was placing the numbers on the playing board just to count that how many numbers he has. He was placing the numbers in increasing order i.e. from 1 to N. But when he was putting the numbers back into his bag, some numbers fell down onto the floor. He picked up all the numbers but one number, he couldn't find. Now he has to go somewhere urgently, so he asks you to find the missing number.
NOTE: Don't use Sorting

Example 1:

Input:                                                       
N = 4                                        
A[] = {1, 4, 3}
Output:
2     
Explanation:
Vaibhav placed 4 integers but he picked
up only 3 numbers. So missing number
will be 2 as it will become 1,2,3,4.
 

Example 2:

Input:                        
N = 5
A[] = {2, 5, 3, 1}
Output:
4
Explanation:
Vaibhav placed 5 integers on the board,
but picked up only 4 integers, so the
missing number will be 4 so that it
will become 1,2,3,4,5.
*/

class Compute {
    
    public static int missingNumber(int A[], int n)
    {
        int arr_sum = 0;
         
         arr_sum = (n*(n+1))/2;
         
         // Your code goes here
         int sum = 0;
         for(int i : A)
         {
             sum += i;
         }
         
         return arr_sum-sum;
         
         //Time Complexity : o(n)
         //Space Complexity : o(1)
    }
}

