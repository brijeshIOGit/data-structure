package com.ds.ModularArithmatic;

public class DivisibilityByEight {
    public static void main(String[] args) {
        String A = "16";

        int n = A.length();

        int ans = 0;

        if(n == 1){
            int x = (A.charAt(0) - '0') % 8;

            if(x == 0){
                ans = 1;
            }
        }

        if(n == 2){
            int y = (A.charAt(0) - '0') * 10 + (A.charAt(1) - '0');
            if(y % 8 == 0){
                ans = 1;
            }
        }

        if(n>2){
            int z = (A.charAt(n-3) - '0') * 100 + (A.charAt(n-2) - '0') * 10 + (A.charAt(n-1) - '0');
            if(z % 8 == 0){
                ans = 1;
            }
        }



        System.out.println("Ans: "+ans);

    }
}


/*
Problem Constraints
1 <= length of the String <= 100000
'0' <= A[i] <= '9'


Input Format
The only argument given is a string A.


Output Format
Return 1 if it is divisible by eight else return 0.


Example Input
Input 1:
A = "16"
Input 2:

A = "123"
 */

/*
Solution Approach

Since the input number may be huge, we cannot use n % 8 to check if a number is divisible by eight or not, especially in languages like C/C++. The idea is based on the following fact.

A number is divisible by eight if the number formed by the last three digits of it is divisible by 8.
 */