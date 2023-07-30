package com.ds.ArraysAndMAth;

public class SpidersWeb {
    public static void main(String[] args) {
        System.out.println("Ans: 13th Day");
    }
}

/*
A spider is trying to build a web for itself. The web built by it doubles every day.

If the spider entirely built the web in 15 days, how many days did it take for the spider to build 25% of the web?

Answer is an integer. Just put the number without any decimal places if it's an integer. If the answer is Infinity, output Infinity.

Feel free to get in touch with us if you have any questions
 */

/*
Solution
Given that Spider doubles its work every day let’s figure out the amount of work done till the 14th day ( a day before 15 days ).
Let’s say the work done till the 14th day is X. Spider doubled the work done till the 14th on 15th. On day 15th, Spider did X more work.

We know that 2X = 100% work.
Which means X = 50% work.

The Spider built 50% of the web till the 14th day.
If you extend it, the Spider did 25% of the work till the 13th day.
 */
