/*Implement Code in java in which There are N houses built in a line, each of which contains some value in it. A thief is going to steal the maximum value of these houses, but he can’t steal in two adjacent houses because the owner of the stolen houses will tell his two neighbors left and right sides. The task is to find what is the maximum stolen value.

Examples: 

Input: hval[] = {6, 7, 1, 3, 8, 2, 4}
Output: 19
Explanation: The thief will steal 6, 1, 8 and 4 from the house.

Approach - Naive Approach

Time Complexity:  O(2^N)
Time Complexity:  O(2^N)*/

/*
public class P03_Stolen_value {
   static int maxLoot(int hval[], int n) {
      if(n<0) {
        return 0;
      }
      if(n==0) {
        return hval[0];
      }
      int pick = hval[n] + maxLoot(hval, n-2);
      int notPick = maxLoot(hval, n-1);
      return Math.max(pick,notPick);
   }    
   public static void main(String[] args) 
   { 
     int hval[] = { 6, 7, 1, 3, 8, 2, 4 }; 
     int n = hval.length; 
     System.out.println("Maximum loot possible : "
                        + maxLoot(hval, n-1)); 
   }  
}
*/

/*Approach 2- using O(n) extra space 
 * 
 * Time Complexity : O(n^2)
 * 
 * Space Complexity: O(n)
*/

/*
import java.util.Arrays;

public class P03_Stolen_value {
    static void solve(int n, int[] v) {
        int[] dp = new int[n];
        Arrays.fill(dp,-2);
        if(n==1 || n==2) {
            System.out.print("Maximum loot possible : "); 
            int max = Integer.MAX_VALUE;
            for(int i =0;i<v.length;i++) {
                max = Math.max(v[i],max);
            }
            System.out.println(max);
            return;
        }
        dp[0] = v[0];
        dp[1] = v[1];
        for(int i =2;i<n;i++) {
            int money =0;
            dp[i] = v[i];
            for(int j =i-2;j>=0;j--) {
                money = Math.max(money,dp[j]);
            }
            dp[i] += money;
        }
        int m = Arrays.stream(dp).max().getAsInt();
        System.out.print("Maximum loot possible : "); 
        System.out.println(m); 
        return;
    }
    public static void main(String[] args) 
  { 
    int n = 7; 
    int[] v = { 6, 7, 1, 3, 8, 2, 4 }; 
    solve(n, v); 
  } 
} */

/*Approach - 3: Dynamic Programming(Bottom Up Approach) 
 * 
 * Time Complexity : O(N)
 * 
 * Space Complexity : O(N)
*/

public class P03_Stolen_value {
  static int maxLoot(int hval[], int n) {
    if(n==0) return 0;
    if(n==1) return hval[0];
    if(n==2) return Math.max(hval[0],hval[1]);

    int[] dp = new int[n];
    dp[0] = hval[0];
    dp[1] = Math.max(hval[0],hval[1]);

    for(int i =2;i<n;i++) 
        dp[i] = Math.max(hval[i] + dp[i-2] , dp[i-1]);
    return dp[n-1];
  }
  public static void main(String[] args) 
    { 
        int hval[] = { 6, 7, 1, 3, 8, 2, 4 }; 
        int n = hval.length; 
        System.out.println("Maximum loot possible : " + maxLoot(hval, n)); 
    } 
  }