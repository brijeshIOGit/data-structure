package com.ds.String;

public class ReverseTheString {
    public static void main(String[] args) {
        String s = "Sky is blue";
        int n = s.length();

        String ans = "";
        for(int i = n-1;i>=0;i--){
            if(s.charAt(i) != ' '){
                String current = "";
                while(i>=0 && s.charAt(i) != ' '){
                    current+= s.charAt(i);
                    i--;
                }
                current = reverse(current);

                if(!ans.isEmpty()){
                    ans+= ' ';
                }
                ans+=current;

            }
        }

        System.out.println("Ans: "+ans);
    }

    public static String reverse(String str){
        int start = str.length()-1;

        String ans="";

        while(start>=0){

            ans+=str.charAt(start);
            start--;

        }

        return ans;
    }
}


/*
Problem Description
You are given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.


Problem Constraints
1 <= N <= 3 * 105



Input Format
The only argument given is string A.



Output Format
Return the string A after reversing the string word by word.



Example Input
Input 1:
A = "the sky is blue"
Input 2:
A = "this is ib"


Example Output
Output 1:
"blue is sky the"
Output 2:
"ib is this"


Example Explanation
Explanation 1:
We reverse the string word by word so the string becomes "blue is sky the".
Explanation 2:
We reverse the string word by word so the string becomes "ib is this".
 */

/*
Solution Approach
One simple approach is a two-pass solution:

First pass to split the string by spaces into an array of words
Then second pass to extract the words in reversed order
We can do better in one-pass. While iterating the string in reverse order, we keep track of a word’s beginning and end position.

When we are at the beginning of a word, we append it.
 */
