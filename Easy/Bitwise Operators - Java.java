/*
Bitwise operators are useful when we want to work with bits. Here, we'll take a look at them.

Given three positive integers a, b and c. Your task is to perform some bitwise operations on them as given below:
1. d = a ^ a
2. e = c ^ b
3. f = a & b
4. g = c | (a ^ a)
5. h = ~e
Note: ^ is for xor.*/

class Geeks {
    static void bitWiseOp(int a, int b, int c) {

        // Your code here
        System.out.println((a^a)+"\n"+(c^b)+"\n"+(a&b)+"\n"+(c|(a^a))+"\n"+(~(c^b)));
    }
}
