/*Implement Code in java in which we have to find the longest palindromic subsequence.
 * 
 * Time Complexity : O(n^2)
 * Space Complexity : O(n^2)
 */

public class P03_Using_Bottum_up_dp {
    static int lps(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
    public static void main(String[] args) {
        String s = "GEEKSFORGEEKS";
        System.out.println("The length of the LPS is " + lps(s));
    }
}
