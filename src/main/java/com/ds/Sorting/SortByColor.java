package com.ds.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SortByColor {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 0, 1, 2));

        int zero =  0;

        int two = list.size()-1;

        for(int i = 0;i<=two;){
            if(list.get(i) == 0){
                int temp = list.get(zero);
                list.set(zero,0);
                list.set(i,temp);
                zero++;
                i++;
            }else if(list.get(i) == 2){
                int temp = list.get(two);
                list.set(two,2);
                list.set(i,temp);
                two--;
            }else{
                i++;
            }



        }

        System.out.println("Ans: "+list.toString());


    }

}

/*
Problem Description
Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will represent the colors as,

red -> 0
white -> 1
blue -> 2

Note: Using the library sort function is not allowed.



Problem Constraints
1 <= N <= 1000000
0 <= A[i] <= 2


Input Format
First and only argument of input contains an integer array A.


Output Format
Return an integer array in asked order


Example Input
Input 1 :
    A = [0, 1, 2, 0, 1, 2]
Input 2:

    A = [0]


Example Output
Output 1:
    [0, 0, 1, 1, 2, 2]
Output 2:

    [0]


Example Explanation
Explanation 1:
    [0, 0, 1, 1, 2, 2] is the required order.
Explanation 2:
    [0] is the required order
 */

/*
Solution Approach
There are multiple approaches possible here. We need to make sure we do not allocate extra memory.

Approach 1:

Count the number of red, white, and blue balls.
Then, in another pass, set the initial redCount number of cells as 0, next whiteCount cell as 1, and next blueCount cells as 2.
Requires two passes of the array.

Approach 2:

Swap the 0s to the start of the array maintaining a pointer, and 2s to the end of the array.
1s will automatically be in their right position.
 */
