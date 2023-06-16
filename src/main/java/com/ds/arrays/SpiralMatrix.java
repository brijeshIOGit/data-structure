package com.ds.arrays;

public class SpiralMatrix {

     static int arr[][] = {
             {1,2,3,4,5},
             {6,7,8,9,10},
             {11,12,13,14,15},
             {16,17,18,19,20},
             {21,22,23,24,25}
     };
     static int N = arr.length;
    static int i = 0;
    static int j = 0;

    public static void main(String[] args) {
        while(N>1){
            for(int k = 1;k<=N-1;k++){
                System.out.println(arr[i][j]);
                j++;
            }
            for(int k = 1;k<=N-1;k++){
                System.out.println(arr[i][j]);
                i++;
            }
            for(int k = 1;k<=N-1;k++){
                System.out.println(arr[i][j]);
                j--;
            }
            for(int k = 1;k<=N-1;k++){
                System.out.println(arr[i][j]);
                i--;
            }
            N = N-2;
            i++;
            j++;
        }
        if(N == 1){
            System.out.println(arr[i][j]);
        }
    }
}


// TC : O(N^2) ans SC : O(1)
