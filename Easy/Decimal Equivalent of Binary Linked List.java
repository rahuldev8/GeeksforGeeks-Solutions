/*
Given a singly linked list of 0s and 1s, the task is to find its decimal equivalent. Decimal Value of an empty linked list is considered as 0.

Since the answer can be very large, answer modulo 1000000007 should be printed.
*/

class gfg
{
   long DecimalValue(Node head)
   {
 	    long ans = 0;
 	    while(head!=null)
 	    {
 	        //Since we are converting Binary to decimal, multiplying the previous
            // value with 2, AS LIKE AS DECIMAL(x By 10)
 	        ans *= 2;
 	        //adding current value to ans
 	        ans += head.data;
 	        //As question demands, taking moulo for every ans by 1000000007
 	        ans %= 1000000007;
 	        head = head.next;
 	    }
 	    return ans;
 	    
 	    //Time Complexity : o(n)
 	    //Space Complexity : o(1)
   }
}
