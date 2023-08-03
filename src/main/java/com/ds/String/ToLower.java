package com.ds.String;

import java.util.Arrays;

public class ToLower {
    public static void main(String[] args) {
        char[] A = {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};


        // 65-90


        for(int i = 0;i<A.length;i++){
            if((int)A[i]>= 65 && (int)A[i]<=90){
                A[i] = (char)('a' + (A[i]-'A'));
            }
        }
        System.out.println("Ans"+ Arrays.toString(A) );
    }
}

/*
Problem Description
You are given a function to_lower() which takes a character array A as an argument.

Convert each character of A into lowercase characters if it exists. If the lowercase of a character does not exist, it remains unmodified.
The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.

Return the lowercase version of the given character array.



Problem Constraints
1 <= |A| <= 105



Input Format
The only argument is a character array A.



Output Format
Return the lowercase version of the given character array.



Example Input
Input 1:

 A = ['S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
Input 2:

 A = ['S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0']


Example Output
Output 1:

 ['s', 'c', 'a', 'l', 'e', 'r', 'a', 'c', 'a', 'd', 'e', 'm', 'y']
Output 2:

 ['s', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']


Example Explanation
Explanation 1:

 All the characters in the returned array are in lowercase alphabets.
Explanation 2:
 Since there is no lowercase version for '#', '2'and '0'.  It remains unchanged.
 Rest of the Uppercase alphabets are converted to lowercase accordingly.
 */

/*
Loop through the character array and
Use the ascii codes of each character to convert them to lowercase.

If A[i] is uppercase, we can change it to 'a' + (A[i]-'A')
 */
