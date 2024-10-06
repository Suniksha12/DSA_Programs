/*Implement code in java in which we have been Given a string ‘S’, 
find the length of the Longest Palindromic Subsequence in it. 
The Longest Palindromic Subsequence (LPS) is the problem of 
finding a maximum-length subsequence of a given string that is 
also a Palindrome. 

Input: S = “GEEKSFORGEEKS”
Output: 5
Explanation: The longest palindromic subsequence we can get is of length 5. There are more than 1 palindromic subsequences of length 5, for example: EEKEE, EESEE, EEFEE, …etc.

Approach - 1 Recursive Solution
Time Complexity : O(2^n)
Space Complexity : O(N^2)
*/

/*
public class P02_Longest_Palindromic_subsequnce {
    static int lps(String s , int lo , int hi){
        if(lo==hi)
           return 1;
        if(s.charAt(lo)==s.charAt(hi) && lo+1==hi)
           return 2;
        if(s.charAt(lo) == s.charAt(hi))
           return lps(s,lo+1,hi-1)+2;
        return Math.max(lps(s,lo,hi-1),lps(s,lo+1,hi));
    }
    public static void main(String[] args) {
        String s = "GEEKSFORGEEKS";
        int n = s.length();
        System.out.println("The length of the LPS is "
                                       + lps(s, 0, n - 1)); 
    }
}*/

/*Approach - 2 Using Memoization
 * Time Complexity : O(n^2)
 * Space Complexity : O(n^2)
 */

import java.util.Arrays;

public class P02_Longest_Palindromic_subsequnce {
    static int lpsRec(String s, int lo, int hi, int[][] memo) {
        if (lo == hi)
            return 1;
        if (s.charAt(lo) == s.charAt(hi) && lo + 1 == hi)
            return 2;
        if (memo[lo][hi] != -1)
            return memo[lo][hi];
        if (s.charAt(lo) == s.charAt(hi))
            return memo[lo][hi] = lpsRec(s, lo + 1, hi - 1, memo) + 2;
        return memo[lo][hi] = Math.max(lpsRec(s, lo, hi - 1, memo), lpsRec(s, lo + 1, hi, memo));
    }

    static int lps(String s) {
        int n = s.length();
        int[][] memo = new int[n][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return lpsRec(s, 0, n - 1, memo);
    }

    public static void main(String[] args) {
        String s = "GEEKSFORGEEKS";
        System.out.println("The length of the LPS is "
                + lps(s));
    }
}
