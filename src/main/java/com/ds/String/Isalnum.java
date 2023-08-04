package com.ds.String;

public class Isalnum {
    public static void main(String[] args) {

        char[] A = {'S','c','a','l','e','r','A','c','a','d','e','m','y','2','0','2','0'};
        int ans = 1;
        for(int i = 0;i<A.length;i++){
            if(!(((int)A[i]>= 97 && (int)A[i]<=122) || ((int)A[i]>= 65 && (int)A[i]<=90) || ((int)A[i]>= 48 && (int)A[i]<=57))){
                ans = 0;
                break;
            }
        };

        System.out.println("Ans: "+ans);
    }
}

/*
Problem Description
You are given a function isalpha() consisting of a character array A.

Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.



Problem Constraints
1 <= |A| <= 105



Input Format
Only argument is a character array A.



Output Format
Return 1 if all the characters of the character array are alphanumeric (a-z, A-Z and 0-9), else return 0.



Example Input
Input 1:

 A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']
Input 2:

 A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 All the characters are alphanumeric.
Explanation 2:

 All the characters are NOT alphabets i.e ('#').
 */

/*
Solution Approach
Loop through the character array and check if the ascii value of each character lies in the range of an alphabet or number.
If all the characters are alphanumeric, then return 1, else return 0.
 */
