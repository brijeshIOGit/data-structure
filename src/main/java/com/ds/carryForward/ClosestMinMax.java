package com.ds.carryForward;

public class ClosestMinMax {

    static int[] arr = {2, 6, 1, 6, 9};

    public static void main(String[] args) {
        int minEl = arr[0];
        int maxEl = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(minEl>arr[i]){
                minEl = arr[i];
            }
            if(maxEl<arr[i]){
                maxEl = arr[i];
            }
        }

        int minPos = Integer.MAX_VALUE;
        int maxPos = Integer.MIN_VALUE;


        for(int i = 0;i<arr.length;i++){
            if(arr[i] == minEl){
                minPos = i;
            }
            if(arr[i] == maxEl){
                maxPos = i;
            }
        }

        int ans = Math.abs(maxPos-minPos) + 1;

        System.out.println("ANS: "+ans);


    }

}

/*
Problem Description
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.



Problem Constraints
1 <= |A| <= 2000



Input Format
First and only argument is vector A



Output Format
Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array



Example Input
Input 1:

A = [1, 3, 2]
Input 2:

A = [2, 6, 1, 6, 9]


Example Output
Output 1:

 2
Output 2:

 3


Example Explanation
Explanation 1:

 Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.
Explanation 2:

 Take the last 3 elements of the array.
 */
