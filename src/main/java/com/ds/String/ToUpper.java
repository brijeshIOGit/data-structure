package com.ds.String;

import java.util.Arrays;

public class ToUpper {
    public static void main(String[] args) {

        char[] A = {'S','c','A','L','E','r','A','c','a','D','e','m','y'};

        // 97 - 122
        for(int i = 0;i<A.length;i++){
            if((int)A[i]>= 97 && (int)A[i]<=122){
                A[i] = (char)('A'+(A[i] -'a'));
            }
        };

        System.out.println("Ans: "+ Arrays.toString(A));
    }
}

/*
Problem Description
You are given a function to_upper() consisting of a character array A.

Convert each character of A into Uppercase character if it exists. If the Uppercase of a character does not exist, it remains unmodified.
The lowercase letters from a to z is converted to uppercase letters from A to Z respectively.

Return the uppercase version of the given character array.



Problem Constraints
1 <= |A| <= 105



Input Format
Only argument is a character array A.



Output Format
Return the uppercase version of the given character array.



Example Input
Input 1:

 A = ['S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
Input 2:

 A = ['S', 'c', 'a', 'L', 'e', 'R', '#', '2', '0', '2', '0']


Example Output
Output 1:

 ['S', 'C', 'A', 'L', 'E', 'R', 'A', 'C', 'A', 'D', 'E', 'M', 'Y']
Output 2:

 ['S', 'C', 'A', 'L', 'E', 'R', '#', '2', '0', '2', '0']


Example Explanation
Explanation 1:
 All the characters in the returned array are in uppercase alphabets.
Explanation 2:
 Since there is no Uppercase version for '#', '2'and '0'.  It remains unchanged.
 Rest of the Lowercase alphabets are converted to Uppercase accordingly.
 */

/*
Solution Approach
Loop through the character array and
use the ascii codes of each character to convert them to uppercase.

If A[i] is lowercase, we can change it to 'A' + (A[i]-'a')
 */
