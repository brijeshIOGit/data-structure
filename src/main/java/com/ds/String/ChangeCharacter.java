package com.ds.String;

import java.util.Arrays;
import java.util.Collections;

public class ChangeCharacter {
    public static void main(String[] args) {
        String A = "abcabbccd";
        int B= 3;

        int N = A.length();
        int[] freq = new int[26];
        int totalDistinct = 0;
        for(int i = 0;i<N;i++){
            freq[A.charAt(i) - 'a']++;
        }

        for(int i = 0;i<26;i++){
            if(freq[i]>0){
                totalDistinct++;
            }
        }

        Arrays.sort(freq);

        int changes = 0;

        for(int i = 0;i<26;i++){
            if(freq[i]>0 && (B-freq[i] >=0)){
                B = B-freq[i];
                changes++;
            }
        }

        System.out.println("ans: "+(totalDistinct-changes));






    }
}

/*
Problem Description
You are given a string A of size N consisting of lowercase alphabets.

You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.

Find the minimum number of distinct characters in the resulting string.



Problem Constraints
1 <= N <= 100000

0 <= B <= N



Input Format
The first argument is a string A.

The second argument is an integer B.



Output Format
Return an integer denoting the minimum number of distinct characters in the string.



Example Input
A = "abcabbccd"
B = 3



Example Output
2



Example Explanation
We can change both 'a' and one 'd' into 'b'.So the new string becomes "bbcbbbccb".
So the minimum number of distinct character will be 2.
 */

/*
Solution Approach
Since there are 26 characters we can find frequency of each character.
Sort them in ascending order. Since we have to minimize the number of distinct characters, we will change characters whose frequency is less into the character which has the highest frequency.
We will check the maximum number of distinct characters we can successfully change.
 */
