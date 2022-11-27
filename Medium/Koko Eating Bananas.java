/*
Given N piles of bananas, the ith pile has piles[i] bananas and H hours time until guards return (N < H). Find the minimum (S) bananas to eat per hour such that Koko can eat all the bananas within H hours. Each hour, Koko chooses some pile of bananas and eats S bananas from that pile. If the pile has less than S bananas, then she consumes all of them, and wont eat any more bananas during that hour. 

Example 1:
Input:
n = 4
piles = [3, 6, 7, 11]
H = 8
Output:
4
Example 2:
Input:
n = 5
piles = [30, 11, 23, 4, 20]
H = 5
Output:
30

*/

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int h = sc.nextInt();
            Solution obj = new Solution();
            int ans = obj.Solve(n,a,h);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static boolean canEat(int hours, int k, int[] piles)
    {
        int res = 0;
        
        /*
        let k = 4
        pile = 10
        time required to eat the total pile is 3 hours
        
        Calculation :
        -----------------
        x = 10/4 -> 2 hours
        y = 10%4 -> 2 bananas left to eat, therefore we need an extra hour to eat the remaining
        2+1 -> 3
        */
        for(int i : piles)
        {
            int x = i/k; //for eating multiple of K bananas
            int y = i%k; //for eating remaining bananas of x.
            
            res+=x; //adding hours to res
            if(y!=0)res++; //adding an single hour to eat remaining bananas
        }
        return res<=hours;// return true if k value is less than, given hours
    }
    public static int Solve(int N, int[] piles, int H) {
        // code here
        int slow = 1;
        int fast = Integer.MAX_VALUE;
        
        while(slow <= fast)
        {
            int mid = slow + (fast - slow)/2;
            
            if(canEat(H, mid, piles)) fast = mid - 1;
            else slow = mid + 1; 
        }
        return slow;
        
        //Time Complexity : o(M log N)
        //Space Complexity : o(1)
    }
}
        
