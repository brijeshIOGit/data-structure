package com.ds.ModularArithmatic;

public class ConcatenateThreeNumbers {
    public static void main(String[] args) {

        int A = 20;
        int B = 10;
        int C = 30;

        int[] arr = {A,B,C};

        String ans = "";

        int firstMin = A;
        int secondMin = B;
        int thirdMin = C;

        firstMin = Math.min(A,Math.min(B,C));

        if(firstMin == A){
            secondMin = Math.min(B,C);
            thirdMin = Math.max(B,C);
        }else if(firstMin == B){
            secondMin = Math.min(A,C);
            thirdMin = Math.max(A,C);
        }else{
            secondMin = Math.min(B,A);
            thirdMin = Math.max(B,A);
        }

        ans = ans+firstMin+secondMin+thirdMin;
        System.out.println("Ans: "+ans);



    }
}

/*
Problem Description
Given three 2-digit integers, A, B, and C, find out the minimum number obtained by concatenating them in any order.

Return the minimum result obtained.



Problem Constraints
10 <= A, B, C <= 99



Input Format
The first argument of input contains an integer, A.

The second argument of input contains an integer, B.

The third argument of input contains an integer, C.



Output Format
Return an integer representing the answer.



Example Input
Input 1:

 A = 10
 B = 20
 C = 30
Input 2:

 A = 55
 B = 43
 C = 47


Example Output
Output 1:

 102030
Output 2:

 434755


Example Explanation
Explanation 1:

 10 + 20 + 30 = 102030
Explanation 2:

 43 + 47 + 55 = 434755
 */
