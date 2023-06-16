package com.ds.arrays;

import java.util.Scanner;

public class MinMaxOfArray {
    public static void main(String[] args) {
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0;i<size;i++){
            System.out.println("Enter element: "+(i+1));
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;

        for(int i = 0;i < arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max+" "+min);

    }
}
