package com.ds.arrays;

import java.util.Arrays;

public class Array1 {
    public static int arr[] = {1,2,3,4,5,6,7,8};
    public static int k = 3;

    public static void main(String[] args) {
        int n = arr.length;
            k = k % n;
        Array1.reverse(arr,0,arr.length-1);
        Array1.reverse(arr,0,k-1);
        Array1.reverse(arr,k,arr.length-1);


        // final ans
        System.out.println(Arrays.toString(arr));


    }

    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}

/*
    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

        Example 1:

        Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]



        Example 2:

        Input: nums = [-1,-100,3,99], k = 2
        Output: [3,99,-1,-100]
        Explanation:
        rotate 1 steps to the right: [99,-1,-100,3]
        rotate 2 steps to the right: [3,99,-1,-100]



        Constraints:

        1 <= nums.length <= 105
        -231 <= nums[i] <= 231 - 1
        0 <= k <= 105


 */
