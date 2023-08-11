package com.ds.String;

public class CountOccurrences {
    public static void main(String[] args) {
        String A = "bobob";
        int N = A.length();
        int ans = 0;
        for(int i = 0;i<A.length();i++){
            if(A.charAt(i) == 'b' && (N-i)>=3){
                char second = A.charAt(i+1);
                char third = A.charAt(i+2);
                if(second == 'o' && third == 'b'){
                    ans++;
                }
            }
        }
        System.out.println("Ans: "+ans);
    }
}
/*
Problem Description
Find the number of occurrences of bob in string A consisting of lowercase English alphabets.



Problem Constraints
1 <= |A| <= 1000


Input Format
The first and only argument contains the string A, consisting of lowercase English alphabets.


Output Format
Return an integer containing the answer.


Example Input
Input 1:

  "abobc"
Input 2:

  "bobob"


Example Output
Output 1:

  1
Output 2:

  2


Example Explanation
Explanation 1:

  The only occurrence is at second position.
Explanation 2:

  Bob occures at first and third position.
 */

/*
Solution Approach
Iterate over the string and for each index i check whether substring
formed by the index i, i+1 and i+2 is "bob" or not if yes then increase
answer. You can also use inbuilt function for the same if it is present
in your preferred language.
 */
