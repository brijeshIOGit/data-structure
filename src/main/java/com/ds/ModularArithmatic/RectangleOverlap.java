package com.ds.ModularArithmatic;

public class RectangleOverlap {
    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        int C = 4;
        int D = 4;
        int E = 2;
        int F = 2;
        int G = 6;
        int H = 6;

        int ans = 1;

        if(C<= E ||  A>= G || D<= F || H<=B){
            ans = 0;
        }

        System.out.println("Ans: "+ans);
    }
}

/*
Problem Constraints
-104 <= A < C <= 104

-104 <= B < D <= 104

-104 <= E < G <= 104

-104 <= F < H <= 104



Input Format
The eight arguments are integers A, B, C, D, E, F, G, and H.


Output Format
Return 1 if the two rectangles overlap else, return 0.


Example Input
Input 1:

A = 0   B = 0
C = 4   D = 4
E = 2   F = 2
G = 6   H = 6
Input 2:

A = 0   B = 0
C = 1   D = 1
E = 2   F = 2
G = 3   H = 3


Example Output
Output 1:
1
Output 2:

0


Example Explanation
Explanation 1:
Rectangle with bottom left (2, 2) and top right (4, 4) is overlapping.
Explanation 2:

There is no Overlapping found.
 */

/*
Solution Approach
You can formulate the required conditions.

First, we can see if a foot of one rectangle is >= top of another rectangle, then an answer is not possible.

You can make a similar argument about the y-axis.
 */
