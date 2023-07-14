package com.ds.arrays;

public class ClosestMinMax {
    static int[] arr = {2, 6, 1, 6, 9};

    public static void main(String[] args) {
        int minPos = Integer.MAX_VALUE;
        int maxPos = Integer.MIN_VALUE;

        int min = arr[0];
        int max = 0;
        int ans = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }else if(arr[i]<min){
                min = arr[i];
            }
        }

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == min){
                minPos = i;
            }
            if(arr[i] == max){
                maxPos = i;
            }

            if(minPos != Integer.MAX_VALUE && maxPos != Integer.MIN_VALUE){
                int rs = Math.abs(minPos - maxPos) + 1;
                ans = Math.min(ans,rs);
            }
        }

        System.out.println("Ans: "+ans);
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
