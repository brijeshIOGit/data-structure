package com.ds.interviewProblems;

public class starPattern {
    public static void main(String[] args) {
        int n = 4;
        for(int  i = 1;i<=n;i++){
            for(int j=i; j<=n; j++)
                System.out.print("*");
            for(int j=1; j<=(2*i-2); j++)
                System.out.print(" ");
            for(int j=i; j<=n; j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for(int  i = n;i>=1;i--){
            for(int j=i; j<=n; j++)
                System.out.print("*");
            for(int j=1; j<=(2*i-2); j++)
                System.out.print(" ");
            for(int j=i; j<=n; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
