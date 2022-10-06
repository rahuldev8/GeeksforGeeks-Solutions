/*
We've learnt about operators and other basics of CPP. Now, it's time to take another leap and learn to use control structures that helps us choose flow of any code.

Given two integers a and b. Your task is to print the even number first and odd number next in individual lines.*/

class Solution{
    public:
    void evenOdd(int a, int b){
        if(a%2 == 0)
        cout<<a<<endl<<b;
        else
        cout<<b<<endl<<a;
        // Code here
    }
};
