package com.ds.BitManupulation;

public class FindingGoodDays {
    public static void main(String[] args) {
        int A = 8;

        int ans = 0;

        while(A>0){
            if((A & 1) == 1){
                ans++;
            }
            A = A >> 1;
        }

        System.out.println("Ans: "+ans);
    }
}

/*
Problem Description
Alex has a cat named Boomer. He decides to put his cat to the test for eternity.

He starts on day 1 with one stash of food unit, every next day, the stash doubles.

If Boomer is well behaved during a particular day, only then she receives food worth equal to the stash produced on that day.

Boomer receives a net worth of A units of food. What is the number of days she received the stash?



Problem Constraints
1 <= A <= 231-1



Input Format
First and only argument is an integer A.



Output Format
Return an integer denoting the number of days Boomer was well behaved.



Example Input
Input 1:

A = 5
Input 2:

A = 8


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 To eat a total of 5 units of food, Boomer behaved normally on Day 1 and on the Day 3.
Explanation 2:

 To eat a total of 8 units of food, Boomer behaved normally only on day 4.
 */


/*
Solution Approach:



Given stash doubles every next day:
  1st Day   stash is  20  =>  1 Unit
  2nd Day  stash is 21  =>  2 Units
  3rd Day  stash is  22   =>  4 Units
  4th Day  stash is  23   =>  8 Units
  5th Day  stash is  24   =>  16 Units
  . .
  . .
  Nth Day  stash is 2N-1 => say(X Units)

Cat will be rewarded with total stash units on that particular day if behaved properly, Else it won't get any food(i.e., 0 stash Units) if not behaved properly.

Ex1:
  now let's consider cat was given stash Units N = 13
  so, In what all ways we can add the above stash Units, such that total will be equal to N = 13.
  ==> (1 + 4 + 8) (i.e., 1st Day + 3rd Day + 4th Day) ==> 3 Days(Cat Behaved)
  Here we can write 13 in Binary as  '1101' and our answer is 3.

Ex2:
  now let's consider cat was given stash Units N = 16
  so, In what all ways we can add the above stash Units, such that total will be equal to N = 16.
  ==> (16) (i.e., Only on 5th Day) ==> 1 Day (Cat Behaved)
  Here we can write 16 in Binary as  '10000' and our answer is 1.

Ex3:
now let's consider cat was given stash Units N = 15
so, In what all ways we can add the above stash Units, such that total will be equal to N = 15.
==> (1 + 2 + 4 + 8) (i.e., 1st Day + 2nd Day + 3rd Day + 4th Day) ==> 4 Days (Cat Behaved)
Here we can write 15 in Binary as  '1111' and our answer is 4.

From Above Examples, we can observe whatever N can be, the number of Days cat behaved = number of Set bits in N.
 */
