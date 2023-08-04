package com.ds.String;

public class LongestPalindromicString {
    public static void main(String[] args) {
        String A = "abbcccbbbcaaccbababcbcabca";
//bbcccbb
        String ans = "";

        for(int i = 0;i<A.length();i++){
                String rs1 = expand(A,i,i);
                ans = ans.length()>=rs1.length()?ans:rs1;

        }

        for(int i = 0;i<A.length()-1;i++){
            String rs2 = expand(A,i,i+1);
            ans = ans.length()>=rs2.length()?ans:rs2;
        }

        System.out.println("Ans: "+ans);
    }

    public static String expand(String s,int p1, int p2){
        while(p1>=0 && p2<s.length() && s.charAt(p1) == s.charAt(p2)){
            p1--;
            p2++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = p1+1;i<p2;i++){
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}

/*
Problem Description
Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).



Problem Constraints
1 <= N <= 6000



Input Format
First and only argument is a string A.



Output Format
Return a string denoting the longest palindromic substring of string A.



Example Input
Input 1:
A = "aaaabaaa"
Input 2:
A = "abba


Example Output
Output 1:
"aaabaaa"
Output 2:
"abba"


Example Explanation
Explanation 1:
We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
Explanation 2:
We can see that longest palindromic substring is of length 4 and the string is "abba".
 */

/*
Solution Approach
A simpler approach, O(N2) time and O(1) space:

In fact, we could solve it in O(N2) time without any extra space.

We observe that a palindrome mirrors around its center. Therefore, a palindrome can be expanded from its center, and there are only 2N-1 such centers.

You might be asking why there are 2N-1 but not N centers?

The reason is that the center of a palindrome can be in between two letters.

Such palindromes have even number of letters (such as “abba”) and their center are between the two ‘b’s.

Since expanding a palindrome around its center could take O(N) time, the overall complexity is O(N2).
 */
