package com.ds.Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class ColorfulNumber {
    public static void main(String[] args) {

        int ans = prod();

        System.out.println("Ans: "+ans);


    }

    public static int prod(){
        int A = 236;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> hm = new HashSet<>();
        while(A!=0){
            list.add(A%10);
            A = A/10;
            count++;
        }

        Collections.reverse(list);

        int N = list.size();





        for(int i = 0;i<N;i++){
            int prod = 1;
            for(int j = i;j<N;j++){
                prod*= list.get(j);

                if(!hm.contains(prod)){
                    hm.add(prod);
                }else{
                    return 0;
                }
            }
        }

        return 1;
    }
}
