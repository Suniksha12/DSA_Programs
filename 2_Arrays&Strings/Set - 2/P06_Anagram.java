/* Implement Code in java such that Given two strings. 
The task is to check whether the given strings are anagrams of each other or not. 
An anagram of a string is another string that contains the same characters, only 
the order of characters can be different. For example, “abcd” and “dabc” are an anagram of each other.

Examples:

Input: str1 = “listen”  str2 = “silent”
Output: “Anagram”
Explanation: All characters of “listen” and “silent” are the same. 

Approach - 1 Sorting

Time Compelxity : O(N * logN)
Space Complexity : O(1)*/

/*
import java.util.Arrays;

public class P06_Anagram {
    static boolean areAnagram(char[] str1, char[] str2){
          int n1 = str1.length;
          int n2 = str2.length;

          if(n1 != n2)
             return false;
          
          Arrays.sort(str1);
          Arrays.sort(str2);

          for(int i =0;i<n1;i++) 
             if(str1[i] != str2[i])
                return false;

          return true;
    }
    public static void main(String[] args) {
        char str1[] = { 'g', 'r', 'a', 'm' };
        char str2[] = { 'a', 'r', 'm' };
       
        // Function Call
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                               + " anagram of each other");
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");
    }
}
*/

/* Approach 2 - Frequency Count 
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(1)
*/

import java.util.Arrays;

public class P06_Anagram {
    static int NO_OF_CHAR= 256;
    static boolean areAnagram(char str1[], char str2[]) {
        int count1[] = new int[NO_OF_CHAR];
        Arrays.fill(count1,0);
        int count2[] = new int[NO_OF_CHAR];
        Arrays.fill(count2, 0);
        int i;

        for(i =0;i<str1.length && i < str2.length;i++) {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }
        if(str1.length != str2.length)
           return false;

        for(i =0;i<NO_OF_CHAR;i++)
            if(count1[i] != count2[i])
               return false;

        return true;
    }
    public static void main(String[] args) {
        char str1[] = ("gram").toCharArray();
        char str2[] = ("arm").toCharArray();
 
        // Function call
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                               + " anagram of each other");
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");
    }
}