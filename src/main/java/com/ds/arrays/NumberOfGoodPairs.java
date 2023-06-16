package com.ds.arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

    public static int[] arr = {1,2,3,1,1,3};
    public static void main(String[] args) {
        System.out.println("ans = "+NumberOfGoodPairs.numIdenticalPairs((arr)));
    }


    public static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        for(int i = 0;i<nums.length;i++){
            if(map.get(nums[i]) != null){
                map.put(nums[i],map.get(nums[i]) + 1);
            }else{
                map.put(nums[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int val = entry.getValue();
            ans = ans + (val * (val-1)/2);
        }

        return ans;

    }
}




/*
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.



Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0


Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
 */
