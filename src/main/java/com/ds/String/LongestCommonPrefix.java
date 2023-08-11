package com.ds.String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] A = {"abab", "ab", "abcd"};
        int N = A.length;

        String s = A[0];

        for(int i = 0;i<N;i++){
            if(s.length()>A[i].length()){
                s = A[i];
            }
        }


        String ans = "";


        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            boolean isQualified = true;

            for(int j = 0;j<N;j++){
                if(A[j].charAt(i) != ch){
                    isQualified = false;
                    break;
                }

            }

            if(isQualified){
                ans+=ch;
            }

        }

        System.out.println("Ans: "+ans);
    }
}

/*
Problem Description
Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.

The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".



Problem Constraints
0 <= sum of length of all strings <= 1000000



Input Format
The only argument given is an array of strings A.



Output Format
Return the longest common prefix of all strings in A.



Example Input
Input 1:

A = ["abcdefgh", "aefghijk", "abcefgh"]
Input 2:

A = ["abab", "ab", "abcd"];


Example Output
Output 1:

"a"
Output 2:

"ab"


Example Explanation
Explanation 1:

Longest common prefix of all the strings is "a".
Explanation 2:

Longest common prefix of all the strings is "ab".
 */
