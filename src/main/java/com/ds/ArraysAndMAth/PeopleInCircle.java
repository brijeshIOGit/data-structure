package com.ds.ArraysAndMAth;

import java.util.ArrayList;

public class PeopleInCircle {
    public static void main(String[] args) {
        int N = 100;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1;i<=N;i++){
            list.add(i);
        }

        int start  = 1;

        while(list.size()>1){
            if(start>=list.size()){
                start%=list.size();
            }
            list.remove(start);
            start+=1;

        }

        System.out.println("Ans: "+list.get(0));
    }
}

/*
One hundred people are standing in a circle in an order 1 to 100.

No.1 has a sword. He kills the next person (i.e., no. 2) and gives the sword to the next (i.e., no. 3). All person does the same until only one survives.

Which number survives at last?

Answer is an integer. Just put the number without any decimal places if it's an integer. If the answer is Infinity, output Infinity.
 */

/*
Solution
Round 1 : 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99
Round 2: 1, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61, 65, 69, 73, 77, 81, 85, 89, 93, 97
Round 3: 1, 9, 17, 25, 33, 41, 49, 57, 65, 73, 81, 89, 97
Round 4: 9, 25, 41, 57, 73, 89
Round 5: 9, 41, 73
Round 6: 9, 73
Round 7: 73
 */
