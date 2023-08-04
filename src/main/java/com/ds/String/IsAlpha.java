package com.ds.String;

public class IsAlpha {
    public static void main(String[] args) {

        char[] A = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y'};
        int ans = 1;
        for(int i = 0;i<A.length;i++){
            if(!(((int)A[i]>= 97 && (int)A[i]<=122) || ((int)A[i]>= 65 && (int)A[i]<=90))){
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

Return 1 if all the characters of the character array are alphabetical (a-z and A-Z), else return 0.



Problem Constraints

1 <= |A| <= 105



Input Format

Only argument is a character array A.



Output Format

Return 1 if all the characters of the character array are alphabetical (a-z and A-Z), else return 0.



Example Input

Input 1:

 A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y']
Input 2:

 A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']


Example Output

Output 1:

 1
Output 2:

 0


Example Explanation

Explanation 1:

 All the characters are alphabets.
Explanation 2:

 All the characters are NOT alphabets i.e ('#', '2', '0', '2', '0').

 */

/*
Solution Approach
```
Loop through the character array and use the inbuilt function to check if the character is an alphabet or NOT.
In C/C++, isalpha() function takes a character and return 0 if the character is NOT an alphabet.

 */
