/*
Given a vector of N positive integers and an integer X. The task is to find the frequency of X in vector.*/

class Solution{
    int findFrequency(int A[], int x){
        int ans = 0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i] == x)ans++;
        }
        return ans;
    }
}
