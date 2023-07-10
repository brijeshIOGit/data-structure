package com.ds.arrays;

public class SpecialIndex {
    static int[] arr = {1,1,1};

    static int sumOdd = 0;
    static int sumEven = 0; 

    static int count = 0;

    public static void main(String[] args) {

        for(int i = 0;i<arr.length;i++){
            if((i & 1) == 1){
                sumOdd+=arr[i];
            }else{
                sumEven+= arr[i];
            }
        }

        System.out.println("oddSum: "+ sumOdd+", Even Sum: "+sumEven);

        int currentOdd = 0;
        int currentEven = 0;

        int newOdd = 0;
        int newEven = 0;

        for(int i = 0;i<arr.length;i++){
                 if(i%2 == 0){
                      sumEven -= arr[i];
                      newEven = sumEven + currentOdd;
                      newOdd = sumOdd + currentEven;

                      currentEven+= arr[i];

                 } else{
                     sumOdd-=arr[i];
                     newEven = sumEven + currentOdd;
                     newOdd = sumOdd + currentEven;

                     currentOdd+=arr[i];
                 }

                 if(newEven == newOdd){
                     count++;
                 }
        }


        System.out.println("Ans: "+count);


    }
}

/*
    arr = {2, 1, 6, 4};

    eventNums = 2,6
    oddNums   = 1,4

    sumOdd = 5 - {1,4}, sumEven = 8 - {2,6}
   `
    i       element     arr       EvenSum     OddSum       evenNums     oddNums
    0       2           {1,6,4}        6          5           {1,4}        {6}
    1       1           {2,6,4}        6          6           {2,4}       {6}
    2       6           {2,1,4}        1          6           {2,4}         {1}
    3       4           {2,1,6}        1          8           {2,6}        {1}
                                                       `

      cOdd = 0;
      cEven = 0;

      newEvenSum = 0;
      newOddSum = 0;
    for(int i =0 ;i<arr.length;i++){
       if(i %2 == 0){
                cEven += arr[i];

                newEvenSum = sumOdd;
                newOddSum = sumEven - cOdd;


       } else{
            cOdd += arr[i];

       }
    }

    arr = {2, 1, 6, 4};

    i       cOdd        cEven       newOdd      newEven
              0            0            0            0

     0         0            2           5             6

 */
