package com.ds.arrays;

import java.util.Arrays;

public class ProductArrayPuzzle {
    static int[] A = {1, 2, 3, 4, 5};
    // [120, 60, 40, 30, 24]

    public static void main(String[] args) {
         int[] P = new int[A.length];
        P[0] = 1;
        for(int i = 1;i<A.length;i++){
            P[i] = P[i-1] * A[i-1];

        }

        int[] S = new int[A.length];
        S[S.length-1] = 1;
        for(int i = A.length-2;i>=0;i--){
            S[i] = S[i+1]*A[i+1];
        }

        int[] ans = new int[A.length];
        for(int i = 0;i<A.length;i++){
            ans[i] = P[i] * S[i];

        }
        System.out.println("Ans: "+Arrays.toString((ans)));

    }
}

/*
Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.

Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.


Input Format

The only argument given is the integer array A.
Output Format

Return the product array.
Constraints

2 <= length of the array <= 1000
1 <= A[i] <= 10
For Example

Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    [120, 60, 40, 30, 24]

Input 2:
    A = [5, 1, 10, 1]
Output 2:
    [10, 50, 5, 50]
 */
