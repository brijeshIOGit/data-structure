package com.ds.ModularArithmatic;

public class LeapYear {
    public static void main(String[] args) {

        int A = 1999;

        int ans = 0;

        if(A % 400 == 0){
            ans = 1;
        }else if(
                (A % 4 == 0 )&& (A%100 !=0)
        ){
            ans = 1;
        }

        System.out.println("Ans: "+ans);
    }
}

/*
Problem Description

Given an integer A representing a year, Return 1 if it is a leap year else, return 0.

A year is a leap year if the following conditions are satisfied:

The year is multiple of 400.
or the year is multiple of 4 and not multiple of 100.

Problem Constraints

1 <= A <= 109



Input Format

First and only argument is an integer A



Output Format

Return 1 if it is a leap year else return 0



Example Input

Input 1

 A = 2020
Input 2:

 A = 1999


Example Output

Output 1

 1
Output 2:

 0


Example Explanation

Explanation 1

 2020 is a leap year.
 2020 is not a multiple of 400 but it is divisible by 4 and also at the same time not divisible by 100.
Explanation 2:

 1999 is not a leap year.
 199 is not a multiple of 400. It is not divisible by 4 and also at the same time not divisible by 100.
 All the conditions fail.
 */



/*
Solution Approach
Here is a step by step explanation of the code

A function solve() is defined
The function solve() takes a parameter ‘A’.
Check if ‘A’ is divisible by 400 by using the condition A%400 == 0.
If true, return 1, indicating that ‘A’ is a leap year.
If step 2 is false, check if ‘A’ is divisible by 100 by using the condition A%100 == 0.
If true, return 0, indicating that ‘A’ is not a leap year.
If step 3 is false, check if ‘A’ is divisible by 4 by using the condition A%4 == 0.
If true, return 1, indicating that ‘A’ is a leap year.
If none of the previous conditions are met, return 0, indicating that ‘A’ is not a leap year.
 */
