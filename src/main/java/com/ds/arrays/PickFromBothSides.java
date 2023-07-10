package com.ds.arrays;

public class PickFromBothSides {
    static int[] arr = {5, -2, 3 , 1, 2};
    static int b = 3;

    public static void main(String[] args) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i<b;i++){
            curSum+=arr[i];

        }
        maxSum = curSum;

        int start = b-1;
        int end = arr.length-1;
        while(start>=0 && end >= 0){
            curSum-=arr[start];
            curSum+= arr[end];
            start--;
            end--;
            maxSum = Math.max(curSum,maxSum);
        }
        System.out.println("Max Sum is: "+maxSum);
    }
}
