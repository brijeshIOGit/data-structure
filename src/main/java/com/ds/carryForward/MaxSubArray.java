package com.ds.carryForward;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] C = {2, 1, 3, 4, 5};
        int B = 12;
        int A = 5;

        int ans = 0;
        for(int i = 0;i<A;i++){
            int sum = 0;
            for(int j = i;j<A;j++){
                sum+=C[j];
                if(sum<=B){
                    ans = Math.max(ans,sum);
                }else{
                    break;
                }
            }
        }

        System.out.println("Ans: "+ans);
    }
}
