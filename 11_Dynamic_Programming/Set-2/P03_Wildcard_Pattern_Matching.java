/*Implement Code in java in which we have been Given two strings pattern and str which may be of different size, You have to return 1 if the wildcard pattern i.e. pattern, matches with str else return 0. All characters of the string str and pattern always belong to the Alphanumeric characters.

The wildcard pattern can include the characters ? and *
‘?’ – matches any single character.
‘*’ – Matches any sequence of characters (including the empty sequence).

Note: The matching should cover the entire str (not partial str).

Examples:

Input: pattern = "ba*a?", str = "baaabab"
Output: 1
Explanation: replace '*' with "aab" and 
'?' with 'b'.
Input: pattern = "a*ab", str = "baaabab"
Output: 0
Explanation: Because in string pattern character 'a' at first position,
pattern and str can't be matched. 
Expected Time Complexity: O(n*m)
Expected Auxiliary Space: O(n*m)
*/

public class P03_Wildcard_Pattern_Matching {
    public static boolean rec(String p, String s , int i , int j , Boolean dp[][]){
        if(dp[i][j] != null) return dp[i][j];
        boolean m = false;
        if(i==p.length() && j == s.length()) m = true;
        else if(i==p.length()) m = false;
        else if(j==s.length()) m =p.charAt(i)=='*' && rec(p,s,i+1,j,dp);
        else if(s.charAt(j)==p.charAt(i) || p.charAt(i)=='?') m = rec(p,s,i+1,j+1,dp);
        else if(p.charAt(i)=='*') m = rec(p,s,i+1,j,dp) || rec(p,s,i,j+1,dp);
        return dp[i][j]=m;
    }
    public static int wildcard(String pattern, String str){
        int pl = pattern.length(),sl=str.length();
        Boolean dp[][] = new Boolean[pl+1][sl+1];
        return rec(pattern,str,0,0,dp) ? 1:0;
    }
    public static void main(String[] args) {
        String pattern="ba*a?";
        String str = "baaabab";
        System.out.print(wildcard(pattern, str));
    }
}
