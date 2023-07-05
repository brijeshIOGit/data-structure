package com.ds.arrays;

import java.util.Arrays;

public class EquilibriumIndex {
    static int[] arr = {-7, 1, 5, 2, -4, 3, 0};
    // pf = [-7, -6, -1, 1, -3, 0, 0]
    static int[] pf = new int[arr.length];
    static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) {
        pf[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            pf[i] = pf[i-1] + arr[i];
        }

        for(int i =0;i<pf.length;i++){
            int leftSum = 0;

            if(i != 0){
                leftSum = pf[i-1];
            }

            int rightSum = pf[pf.length-1] - pf[i];

            if(leftSum == rightSum){
                ans = Math.min(ans,i);
            }

        }

        if(ans != Integer.MAX_VALUE){
            System.out.println("Ans: "+ans);
        }else{
            ans = -1;
            System.out.println("Ans: "+ans);
        }


    }
}
