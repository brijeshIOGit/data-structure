package com.ds.ArraysAndMAth;

public class RepeatNumberThree {
    public static void main(String[] args) {
        int[] A = {4, 1, 3, 2, 4, 4, 3, 3, 7, 3, 4};

        int first = A[0];
        int count1 = 1;

        int second = A[1];
        int count2 = 1;

        for (int i = 2; i < A.length; i++) {
            if (A[i] == first) {
                count1++;
            } else if (A[i] == second) {
                count2++;
            } else if (count1 == 0) {
                first = A[i];
                count1 = 1;
            } else if (count2 == 0) {
                second = A[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == first) {
                count1++;
            }
            if (A[i] == second) {
                count2++;
            }
        }

        int ans = -1;

        if (count1 > (A.length / 3)) {
            ans = first;
        } else if (
                count2 > (A.length / 3)
        ) {
            ans = second;
        }

        System.out.println("Ans: "+ans);


    }
}


/*]
Problem Description
You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.

Note: Read-only array means that the input array should not be modified in the process of solving the problem



Problem Constraints
1 <= N <= 7*105
1 <= A[i] <= 109


Input Format
The only argument is an integer array A.


Output Format
Return an integer.


Example Input
Input 1:
[1 2 3 1 1]
Input 2:
[1 2 3]


Example Output
Output 1:
1
Output 2:
-1


Example Explanation
Explanation 1:
1 occurs 3 times which is more than 5/3 times.
Explanation 2:
No element occurs more than 3 / 3 = 1 times in the array.
 */

/*
Solution Approach
It is important to note that if at a given time, you have 3 distinct element from the array, if you remove them from the array, your answer does not change.

Assume that we maintain 2 elements’ counts as we traverse along the array.

When we encounter a new element, there are 3 cases possible :

We don’t have 2 elements yet. So add this to the list with count as 1.

This element is different from the existing 2 elements. As we said before, we have 3 distinct numbers now. Removing them does not change the answer. So decrement 1 from count of 2 existing elements. If their count falls to 0, obviously its not a part of 2 elements anymore.

The new element is same as one of the 2 elements. Increment the count of that element.

Consequently, the answer will be one of the 2 elements left behind. If they are not the answer, there is no element with count > N / 3.
 */