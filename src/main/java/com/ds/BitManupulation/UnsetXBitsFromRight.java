package com.ds.BitManupulation;

public class UnsetXBitsFromRight {
    public static void main(String[] args) {
        int A = 53;// 110101
        int B = 5;

        for(int i = 0;i<B;i++){

            if((A & (1<<i)) != 0){

                A = A ^ (1<<i);
            }
        }

        System.out.println("Ans: "+A);
    }
}

/*
                     64 32 16 8 4 2 1
Problem Description
Given an integer A. Unset B bits from the right of A in binary.

For example, if A = 93 and B = 4, the binary representation of A is 1011101.
If we unset the rightmost 4 bits, we get the binary number 1010000, which is equal to the decimal value 80.


Problem Constraints
1 <= A <= 1018
1 <= B <= 60


Input Format
The first argument is a single integer A.
The second argument is a single integer B.


Output Format
Return the number with B unset bits from the right.


Example Input
Input 1:-
A = 25
B = 3
Input 2:-
A = 37
B = 3


Example Output
Output 1:-
24
Output 2:-
32


Example Explanation
Explanation 1:-
A = 11001 to 11000
Explantio 2:-
A = 100101 to 100000
 */

/*
Solution Approach
Try using for loops iterate from 0 to B-1 and do the needful.

Initialise a variable ans = A
Iterate from i = 0 to i = B - 1. If ith bit was set in A that is (A & (1<<i)) != 0, ans -= (1<<i), unset it from the answer.
 */
