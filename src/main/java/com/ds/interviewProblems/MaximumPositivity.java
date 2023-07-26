package com.ds.interviewProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MaximumPositivity {
    public static void main(String[] args) {
        // A= [1,2,-5,6,7]
        // 1544618 6602022 4330572
        int[] A = {-5173778,-8176176,1694510,7089884,-1394259,1146372,-2502339,1544618,6602022,4330572};

        int i = 0;
        int j = 0;
        int start = 0;
        int end = 0;
        int N = A.length;
        int maxSize = 0;

        while(i<N && j<N){
            if(A[j]>0){
                j++;
                System.out.println("i: "+i+" j: "+j+" start: "+start +" end: "+end+" ans: "+(end-start+1));
            }else{
                if(j-i>maxSize){
                    start = i;
                    end = j-1;

                    maxSize = end-start+1;

                    System.out.println("start inside: "+start+" end: "+end);


                }
                i = j+1;
                j++;

            }
        }
        System.out.println("start: "+start+" end: "+end);

        if(start == -1 && end == -1){
            start = 0;
            end = A.length-1;
        }
        if(j-i>maxSize){
            start = i;
            end = j-1;
        }
        System.out.println("start: "+start+" end: "+end);

        int[] ans = new int[end-start+1];
        int index = 0;

        for(int k = start;k<=end;k++){
            ans[index] = A[k];
            index++;
        }

        System.out.println("ans: "+ Arrays.toString(ans));


    }
}

/*
Problem Description
Given an array of integers A, of size N.

Return the maximum size subarray of A having only non-negative elements. If there are more than one such subarray, return the one having the smallest starting index in A.

NOTE: It is guaranteed that an answer always exists.



Problem Constraints
1 <= N <= 105

-109 <= A[i] <= 109



Input Format
The first and only argument given is the integer array A.



Output Format
Return maximum size subarray of A having only non-negative elements. If there are more than one such subarrays, return the one having earliest starting index in A.



Example Input
Input 1:

 A = [5, 6, -1, 7, 8]
Input 2:

 A = [1, 2, 3, 4, 5, 6]


Example Output
Output 1:

 [5, 6]
Output 2:

 [1, 2, 3, 4, 5, 6]


Example Explanation
Explanation 1:

 There are two subarrays of size 2 having only non-negative elements.
 1. [5, 6]  starting point  = 0
 2. [7, 8]  starting point  = 3
 As starting point of 1 is smaller, return [5, 6]
Explanation 2:

 There is only one subarray of size 6 having only non-negative elements:
 [1, 2, 3, 4, 5, 6]
 */
