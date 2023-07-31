package com.ds.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NobleInteger {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 2, 1, 3));

        int ans = NobleInteger.solve(A);

        System.out.println("Ans: "+ans);

    }
    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);



        int n = A.size();
        int ans = 0;

        if(A.get(n-1) == 0){
            return 1;
        }

        for(int i = 0;i<n;i++){
            if(A.get(i) == (n-1-i) && (i+1)<n && A.get(i) < A.get(i+1)){
                return 1;
            }
        }

        return -1;
    }
}

/*
Problem Description
Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.



Problem Constraints
1 <= |A| <= 2*105
-108 <= A[i] <= 108


Input Format
First and only argument is an integer array A.



Output Format
Return 1 if any such integer p is present else, return -1.



Example Input
Input 1:

 A = [3, 2, 1, 3]
Input 2:

 A = [1, 1, 3, 3]


Example Output
Output 1:

 1
Output 2:

 -1


Example Explanation
Explanation 1:

 For integer 2, there are 2 greater elements in the array..
Explanation 2:

 There exist no integer satisfying the required conditions.
 */

/*
Solution Approach
First, we sort the input array.

Now, all we have to do is to traverse through each element of the array and check whether it matches our given statement.
Since the array is sorted, we directly know how many elements are greater than that number in the array.

**Note: Please take care of cases when a certain element repeats many times.**
 */
