/*
There are times when your answer is a floating point that contains undesired amount of digits after decimal. 
Here, we'll learn how to get a precise answer out of a floating number. 
You are given two floating numbers a and b. You need to output a/b and decimal precision of a/b upto 3 places after decimal point.*/

class Geeks{
    
    static void printInFormat(float a, float b){
        float result = a/b;
        
        
        // Your code here to print upto 3 decimal places
        System.out.print(result+" ");
        System.out.print(String.format("%.3f",result));
        
    }    
    
}
