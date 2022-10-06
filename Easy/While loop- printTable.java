/*
While loop is another loop like for loop but unlike for loop it only checks for one condition.

Here, we will use while loop and print a number n's table in reverse order.*/

class Solution{
    public void printTable(int n){
        int ans = 10;
        while(ans>0)
        {
            System.out.print(ans*n+" ");
            ans--;
        }
        System.out.println();
    }
}
