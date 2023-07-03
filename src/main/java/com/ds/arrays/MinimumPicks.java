package com.ds.arrays;

public class MinimumPicks {

    static int[] arr = {0,2,9};
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

   static int n = arr.length;
   static int ans = 0;

    public static void main(String[] args) {
        for(int i = 0;i<n;i++){
            if((arr[i] & 1) == 0) {
                max = Math.max(max,arr[i]);
            } else if ((arr[i] & 1) == 1) {
                min = Math.min(min,arr[i]);
            }
        }

        ans = max-min;

        System.out.println("Ans: "+ans);


    }


}

/*

TC:O(n)
SC:O(1)
Problem Description
You are given an array of integers A of size N.
Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.



Problem Constraints
2 <= N <= 1e5
-1e9 <= A[i] <= 1e9
There is atleast 1 odd and 1 even number in A



Input Format
The first argument given is the integer array, A.



Output Format
Return maximum among all even numbers of A - minimum among all odd numbers in A.



Example Input
Input 1:

 A = [0, 2, 9]
Input 2:

 A = [5, 17, 100, 1]


Example Output
Output 1:

-7
Output 2:

99


Example Explanation
Explanation 1:

Maximum of all even numbers = 2
Minimum of all odd numbers = 9
ans = 2 - 9 = -7
Explanation 2:

Maximum of all even numbers = 100
Minimum of all odd numbers = 1
ans = 100 - 1 = 99
 */
