package com.ds.BitManupulation;

public class AddBinaryStrings {
    public static void main(String[] args) {
        String A = "110";
        String B = "10";

        int carry = 0;
        int i = A.length() - 1;
        int j = B.length() - 1;
        String ans = "";

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = 0;
            if (i >= 0) {
                sum += (A.charAt(i) - '0');
                i--;
            }
            if (j >= 0) {
                sum += (B.charAt(j) - '0');
                j--;
            }
            sum += carry;
            int bit = sum % 2;


            carry = sum / 2;
            ans = (char) (bit + '0') + ans;

        }

        System.out.println("Ans: " + ans);

    }
}

/*
Problem Description
Given two binary strings A and B. Return their sum (also a binary string).


Problem Constraints
1 <= length of A <= 105

1 <= length of B <= 105

A and B are binary strings



Input Format
The two argument A and B are binary strings.



Output Format
Return a binary string denoting the sum of A and B



Example Input
Input 1:
A = "100"
B = "11"
Input 2:
A = "110"
B = "10"


Example Output
Output 1:
"111"
Output 2:
"1000"


Example Explanation
For Input 1:
The sum of 100 and 11 is 111.
For Input 2:

The sum of 110 and 10 is 1000.

 */
