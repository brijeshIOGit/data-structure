package com.ds.ModularArithmatic;

public class RepeatAndMissingNumber {
    public static void main(String[] args) {

        int[] A = {3,1,2,5,3};

        long ts = 0;
        long tss = 0;

        long as = 0;
        long ass = 0;

        for(int i = 0;i<A.length;i++){
            ts+=A[i];

            tss+= (A[i] * A[i]);

            as+= (i+1);

            ass+= (i+1)*(i+1);
        }

        System.out.println("ts: "+ts);
        System.out.println("tss: "+tss);
        System.out.println("as: "+as);
        System.out.println("ass: "+ass);

        long X = ts-as;
        long Y = tss - ass;

        long a = (X + (Y/X))/2;
        long b = a  - X;

        System.out.println("A: "+a+" B: "+b);





    }
}

/*
The expected return value:
883119 715854
Your function returned the following:
74274 -92991

 */
