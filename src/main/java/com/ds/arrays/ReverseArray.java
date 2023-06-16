package com.ds.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0;i<size;i++){
            System.out.println("Enter element: "+(i+1));
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j = arr.length -1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }


        System.out.println("Arr : "+ Arrays.toString(arr));


    }


}
