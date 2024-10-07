/*Impplement Code in java in which we have been Given two strings, S1 and S2, the task is to find the length of the 
Longest Common Subsequence. If there is no common subsequence, return 0. A subsequence is a string generated from 
the original string by deleting 0 or more characters and without changing the relative order of the remaining characters. 
For example , subsequences of “ABC” are “”, “A”, “B”, “C”, “AB”, “AC”, “BC” and “ABC”. In general a string of length n has 2n subsequences.

LCS problem has great applications like diff utility (find the difference between two files) that we use in our day to day software development.

Examples:

Input: S1 = “ABC”, S2 = “ACD”
Output: 2
Explanation: The longest subsequence which is present in both strings is “AC”.

Approach - 1 Uisng Recursion , Naive Approach

Time Complexity : O(2^min(m,n))
Space Complexity : O(min(m,n))*/

/*
public class P05_Longest_Common_subsequence {
    static int lcs(String s1, String s2, int m, int n){
        if(m==0 || n==0)
           return 0;
        if(s1.charAt(m-1) == s2.charAt(n-1))
           return 1+lcs(s1,s2,m-1,n-1);
        else 
           return Math.max(lcs(s1, s2, m, n-1),lcs(s1, s2, m-1, n));
    }
    public static void main(String[] args) {
        String S1 = "AGGTAB";
        String S2 = "GXTXAYB";
        int m = S1.length();
        int n = S2.length();

        System.out.println("Length of LCS is"
                           + " " + lcs(S1, S2, m, n));
    }
}*/

/*Aprroach -2 Memoization 
 * 
 * Time Complexity : O(m*n)
 * Space complexity : O(m*n)
 */

/* 
import java.util.Arrays;

public class P05_Longest_Common_subsequence {
    static int lcs(String s1, String s2, int m, int n, int[][] memo) {
        if (m == 0 || n == 0)
            return 0;
        if (memo[m][n] != -1)
            return memo[m][n];
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return memo[m][n] = 1 + lcs(s1, s2, m - 1, n - 1, memo);
        }
        return memo[m][n] = Math.max(lcs(s1, s2, m, n - 1, memo), lcs(s1, s2, m - 1, n, memo));
    }

    public static void main(String[] args) {
        String S1 = "AGGTAB";
        String S2 = "GXTXAYB";

        int m = S1.length();
        int n = S2.length();
        int[][] memo = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            Arrays.fill(memo[i], -1);
        }

        System.out.println("Length of LCS is "
                + lcs(S1, S2, m, n, memo));
    }
} */

/*Approach - 3 Using Bottom - Up DP
 * 
 * Time Complexity : O(m*n)
 * Space Complexity : O(m*n)
 */

public class P05_Longest_Common_subsequence {
    static int lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String S1 = "AGGTAB";
        String S2 = "GXTXAYB";
        System.out.println("Length of LCS is "
                + lcs(S1, S2));
    }
}