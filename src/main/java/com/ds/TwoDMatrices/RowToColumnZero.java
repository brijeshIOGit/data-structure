package com.ds.TwoDMatrices;

import java.util.Arrays;

public class RowToColumnZero {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 4},
                {5, 6, 7, 0},
                {9, 2, 0, 4}
        };

        int row = A.length;
        int col = A[0].length;

        for (int i = 0; i < row; i++) {
            int flag = 0;
            for (int j = 0; j < col; j++) {
                if (A[i][j] == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 1) {
                for (int j = 0; j < col; j++) {
                    if (A[i][j] != 0) {
                        A[i][j] = -1;
                    }
                }
            }
        }

        for (int j = 0; j < col; j++) {
            int flag = 0;
            for (int i = 0; i < row; i++) {
                if (A[i][j] == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 1) {
                for (int i = 0; i < row; i++) {
                    if (A[i][j] != 0) {
                        A[i][j] = -1;
                    }
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (A[i][j] == -1) {
                    A[i][j] = 0;
                }
            }
        }

        System.out.println("Ans: "+ Arrays.deepToString(A));


    }
}

/*
Problem Description
You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.



Problem Constraints
1 <= A.size() <= 103

1 <= A[i].size() <= 103

0 <= A[i][j] <= 103



Input Format
First argument is a 2D integer matrix A.



Output Format
Return a 2D matrix after doing required operations.



Example Input
Input 1:

[1,2,3,4]
[5,6,7,0]
[9,2,0,4]


Example Output
Output 1:

[1,2,0,0]
[0,0,0,0]
[0,0,0,0]


Example Explanation
Explanation 1:

A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column zero.
 */
