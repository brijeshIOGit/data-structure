package com.ds.interviewProblems;

public class LengthOfLongestConsecutive1s {
    public static void main(String[] args) {
//        String A = "111011101";
        String A = "11010110000000000";

        int count1s = 0;
        int ans = 0;

        boolean flag = false;

        for(int i = 0;i<A.length();i++){
            if(A.charAt(i) == '1'){
                count1s++;
            }
        }




        for(int i = 0;i<A.length();i++){
            if(A.charAt(i) == '0'){
                flag = true;

                int l = 0;

                for(int j = i-1;j>=0;j--){
                    if(A.charAt(j) == '1'){
                        l++;
                    }else{
                        break;
                    }
                }

                int r = 0;

                for(int j = i+1;j<A.length();j++){
                    if(A.charAt(j) == '1'){
                        r++;
                    }
                    else{
                        break;
                    }
                }

                int len = l+r;
                if(len<count1s){
                    len++;
                }
                ans = Math.max(ans,len);
            }

        }

        if(count1s == 0){
            System.out.println("Ans: "+0);
        }
        else if(flag == false){
            System.out.println("Ans: "+A.length());
        }else{
            System.out.println("Ans: "+ans);
        }


    }
}

/*
Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.


Input Format

The only argument given is string A.
Output Format

Return the length of the longest consecutive 1’s that can be achieved.
Constraints

1 <= length of string <= 1000000
A contains only characters 0 and 1.
For Example

Input 1:
    A = "111000"
Output 1:
    3

Input 2:
    A = "111011101"
Output 2:
    7
 */
