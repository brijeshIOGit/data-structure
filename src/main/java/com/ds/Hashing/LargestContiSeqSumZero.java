package com.ds.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LargestContiSeqSumZero {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,-3,3));
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> rs = new ArrayList<>();
        int sum = 0;
        int l = -1;
        int r = -1;
        int len = 0;

        map.put(0, -1);
        for(int i = 0;i<A.size();i++){
            sum+= A.get(i);
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }else{
                if(i-map.get(sum) > len){
                    l = map.get(sum)  + 1;
                    r = i;
                    len = i - map.get(sum) ;
                }
            }
        }
        System.out.println("l,r: "+l+" , "+r);

        if(l>=0 && r>=0){

            for(int i = l; i <= r; i++){
                rs.add(A.get(i));
            }

            System.out.println("Ans: "+rs.toString());
        }




    }
}

/*
Problem Description
Given an array A of N integers.

Find the largest continuous sequence in a array which sums to zero.



Problem Constraints
1 <= N <= 106

-107 <= A[i] <= 107



Input Format
Single argument which is an integer array A.



Output Format
Return an array denoting the longest continuous sequence with total sum of zero.

NOTE : If there are multiple correct answers, return the sequence which occurs first in the array.



Example Input
A = [1,2,-2,4,-4]


Example Output
[2,-2,4,-4]


Example Explanation
[2,-2,4,-4] is the longest sequence with total sum of zero.

 */

/*
Lets try to reduce the problem to a much simpler problem.
Lets say we have another array sum where

  sum[i] = Sum of all elements from A[0] to A[i]
Note that in this array, sum of elements from A[i] to A[j] = Sum[j] - Sum[i-1]

We need to find j and i such that sum of elements from A[i] to A[j] = 0
 Or Sum[j] - Sum[i-1] = 0
 Or Sum[j] = Sum[i-1]
Now, the problem reduces to finding 2 indices i and j such that sum[i] = sum[j]
 */

/*
Solution Approach
Approach:

There are two steps:

Create cumulative sum array where ith index in this array represents total sum from 1 to ith index element.
Iterate all elements of cumulative sum array and use hashing to find two elements where value at ith index == value at jth index but i != j.
IF element is not present in hash in fill hash table with current element.
 */
