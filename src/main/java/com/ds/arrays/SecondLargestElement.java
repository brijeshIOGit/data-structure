package com.ds.arrays;

public class SecondLargestElement {

    static int[] arr = {1,2,3,4,5};

    static int index = 0;
    static int n = arr.length;
    static int ans = -1;
    public static void main(String[] args) {
        for(int i = 0;i<n;i++){
            if(arr[i]>arr[index]){
                index = i;
            }
        }

        for(int i = 0;i<n;i++){
            if(arr[i] != arr[index]){
                if(arr[i]>ans){
                    ans = arr[i];
                }
            }
        }

        System.out.println("Ans: "+ans);
    }

}

/*

TC: O(n)
SC: O(1)
Problem Description
You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.


Problem Constraints
1 <= |A| <= 105

0 <= A[i] <= 109



Input Format
The first argument is an integer array A.



Output Format
Return the second largest element. If no such element exist then return -1.



Example Input
Input 1:

 A = [2, 1, 2]
Input 2:

 A = [2]


Example Output
Output 1:

 1
Output 2:

 -1


Example Explanation
Explanation 1:

 First largest element = 2
 Second largest element = 1
Explanation 2:

 There is no second largest element in the array.
 */
