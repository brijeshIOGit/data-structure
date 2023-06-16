package com.ds.arrays;

public class LittlePonnyAndMaxElement {

    public static int[] arr = {1,2,3,4,5};
    public static int b = 2;

    public static int ans = 0;
    public static boolean found = false;

    public static void main(String[] args) {
        for(int i = 0;i< arr.length;i++){
            if(arr[i]>b){
                ans++;
            }else if(arr[i] == b){
                found = true;

            }
        }
        if(ans == 0 && !found){
            System.out.println("Not fond!");
        }else{
            System.out.println("Found with operation count: "+ans);
        }
    }



}
/*
Q1. Little Ponny and Maximum Element

Problem Description
Little Ponny is given an array, A, of N integers. In a particular operation, he can set any element of the array equal to -1.

He wants your help in finding out the minimum number of operations required such that the maximum element of the resulting array is B. If it is not possible, then return -1.

Problem Constraints
1 <= |A| <= 105

1 <= A[i] <= 109

Input Format
The first argument of input contains an integer array, A.

The second argument of input contains an integer, B.

Output Format
Return an integer representing the answer.

Example Input
Input 1:

 A = [2, 4, 3, 1, 5]
 B = 3
Input 2:

 A = [1, 4, 2]
 B = 3


Example Output
Output 1:

 2
Output 2:

 -1


Example Explanation
Explanation 1:

 We need to remove 4 and 5 to make 3 the biggest element.
Explanation 2:

 As 3 doesn't exist in the array, the answer is -1.

 */
