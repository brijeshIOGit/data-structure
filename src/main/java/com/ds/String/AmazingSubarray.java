package com.ds.String;

public class AmazingSubarray {
    public static void main(String[] args) {
        String A = "ABEC";

        int count = 0;
        int n = A.length();
        char[] L = {'A','E','I','O','U','a','e','i','o','u'};

        int m = 10003;

        for(int i = 0 ;i<n;i++){
            char c = A.charAt(i);
            if(c == 'A' || c == 'E' || c == 'I' || c== 'O'|| c=='U'|| c=='a'|| c=='e'||c=='i'|| c=='o'|| c=='u'){
                count+= ((n-i)%m);
                count = count % m;
            }
        }

        System.out.println("Ans: "+count);


    }
}


/*
You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

Input

Only argument given is string S.
Output

Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
Constraints

1 <= length(S) <= 1e6
S can have special characters
Example

Input
    ABEC

Output
    6

Explanation
    Amazing substrings of given string are :
    1. A
    2. AB
    3. ABE
    4. ABEC
    5. E
    6. EC
    here number of substrings are 6 and 6 % 10003 = 6.
 */

/*
Solution Approach
The main idea to solve this problem is to traverse the string and when you encounter a vowel, add ( length(string) - position_of_curr_char ) to the answer.
 */