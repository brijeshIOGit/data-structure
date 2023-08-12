package com.ds.Hashing;

import java.util.HashMap;
import java.util.Map;

public class CheckPalindromeSecond {
    public static void main(String[] args) {

        String A = "abbaee";
        int N = A.length();

        Map<Character,Integer> mp = new HashMap<>();

        for(int i=0 ; i<N ; i++){
            if(mp.containsKey(A.charAt(i))){
                mp.replace(A.charAt(i), mp.get(A.charAt(i)), mp.get(A.charAt(i))+1);
            }
            else{
                mp.put(A.charAt(i), 1);
            }
        }

        int oddCount = 0;


        boolean flag = true;
        int freq = -1;
        for(Map.Entry<Character,Integer> x:mp.entrySet()){
            System.out.println("x.getValue() %2 != 0: "+(x.getValue() %2 != 0)+" x.getKey(): "+x.getKey()+" x.getValue(): "+x.getValue());
           if((x.getValue() %2 != 0) ){
               oddCount++;
               freq = x.getValue();

           }
        }


        if(oddCount<=1 && freq % 2 !=0){
            System.out.println("Ans: "+1);
        }else{
            System.out.println("Ans: "+0);
        }

//        System.out.println(mp.toString());

    }
}
/*
Problem Description
Given a string A consisting of lowercase characters.

Check if characters of the given string can be rearranged to form a palindrome.

Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



Problem Constraints
1 <= |A| <= 105

A consists only of lower-case characters.



Input Format
First argument is an string A.



Output Format
Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



Example Input
Input 1:

 A = "abcde"
Input 2:

 A = "abbaee"


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 No possible rearrangement to make the string palindrome.
Explanation 2:

 Given string "abbaee" can be rearranged to "aebbea" to form a palindrome.
 */

/*
character
Solution Approach
A set of characters can form a palindrome if at most one character occurs odd number of times and all characters occur even number of times.

We can do it in O(|A|) time using a count array.
Following are detailed steps.

Create a count array of alphabet size which is typically 26. Initialize all values of count array as 0.
Traverse the given string and increment count of every character.
Traverse the count array and if the count array has more than one odd values, return false. Otherwise return true.
 */
