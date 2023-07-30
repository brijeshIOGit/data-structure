package com.ds.ArraysAndMAth;

public class MajorityElement {
    public static void main(String[] args) {
       final int[] A = {2, 1, 2};

       int maj = A[0];
       int count = 1;
       int n = A.length;

       for(int i = 1;i<n;i++){
           if(A[i] == maj){
               count++;
           } else if (count == 1) {
               maj = A[i];
           }else{
               count--;
           }
       }

       count = 0;

       for(int i = 0;i<n;i++){
           if(A[i] == maj){
               count++;
           }
       }

       int ans = -1;

       if(count > (n/2)){
           ans = maj;
       }

        System.out.println("Ans: "+ans);

    }
}
