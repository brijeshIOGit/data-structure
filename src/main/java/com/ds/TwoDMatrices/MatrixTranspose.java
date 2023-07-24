package com.ds.TwoDMatrices;

import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] A = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int row = A.length;
        int col = A[0].length;
        int[][] ans = new int[col][row];

        for(int i = 0; i<col;i++){
            for(int j = 0;j<row;j++){
                ans[i][j] = A[j][i];
            }
        }

        System.out.println("Ans: "+ Arrays.deepToString(ans));
    }
}

/*
Problem Constraints
1 <= A.size() <= 1000

1 <= A[i].size() <= 1000

1 <= A[i][j] <= 1000



Input Format
First argument is a 2D matrix of integers.



Output Format
You have to return the Transpose of this 2D matrix.



Example Input
Input 1:

A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
Input 2:

A = [[1, 2],[1, 2],[1, 2]]


Example Output
Output 1:

[[1, 4, 7], [2, 5, 8], [3, 6, 9]]
Output 2:

[[1, 1, 1], [2, 2, 2]]


Example Explanation
Explanation 1:

Clearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].
 */
