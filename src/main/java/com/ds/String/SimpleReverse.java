package com.ds.String;

public class SimpleReverse {
    public static void main(String[] args) {
        String A = "Scaler";
        char[] s = A.toCharArray();
        int n = A.length();
        for(int i = 0; i < n/2; i++){
            char tmp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = tmp;
        }


        System.out.println("Ans: "+(new String(s)));
    }
}

/*
Problem Description
Given a string A, you are asked to reverse the string and return the reversed string.



Problem Constraints
1 <= |A| <= 105

String A consist only of lowercase characters.



Input Format
First and only argument is a string A.



Output Format
Return a string denoting the reversed string.



Example Input
Input 1:

 A = "scaler"
Input 2:

 A = "academy"


Example Output
Output 1:

 "relacs"
Output 2:

 "ymedaca"
 */

/*
Solution Approach
One idea is to create new string, iterate A in reverse order
store each character in the new string.
To solve the problem without using extra memory, we can traverse
the string till half of its length, and then swap the ith and n - i - 1th characters
where n is the length of the string
 */
