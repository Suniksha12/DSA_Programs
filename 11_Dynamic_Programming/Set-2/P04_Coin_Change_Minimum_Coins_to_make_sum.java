/*Implement code in java in which we have been Given an array coins[] of size N and a target value sum, where coins[i] represents the coins of different denominations. You have an infinite supply of each of coins. The task is to find minimum number of coins required to make the given value sum. If it’s not possible to make a change, print -1.

Examples:  

Input: coins[] = {25, 10, 5}, sum = 30
Output: 2
Explanation : Minimum 2 coins needed, 25 and 5  


Input: coins[] = {9, 6, 5, 1}, sum = 19
Output: 3
Explanation: 19 = 9 + 9 + 1 

Approach - 1 Recursion
Time Complexity : O(m^sum)
Space Complexity : O(sum)*/

/* 
public class P04_Coin_Change_Minimum_Coins_to_make_sum {
    static int minCoins(int coins[], int m , int sum){
        if(sum==0) return 0;
        int res = Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            if(coins[i]<=sum){
                int sub_res = minCoins(coins, m, sum-coins[i]);
                if(sub_res != Integer.MAX_VALUE && sub_res + 1<res)
                   res = sub_res +1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int coins[] =  {9, 6, 5, 1};
       int m = coins.length;
       int sum = 11;
       System.out.println("Minimum coins required is "+ minCoins(coins, m, sum) );
    }
} */

/*Approach - 2  Dynamic Programming (Top Down/Memoization)
 * 
 * Time Compelxity : O(m*sum)
 * Space Complexity : O(sum)
*/

/* 
import java.util.Arrays;

public class P04_Coin_Change_Minimum_Coins_to_make_sum {
    public static int minCoinsUtil(int[] coins, int m, int sum, int[] dp) {
        if (sum == 0)
            return 0;
        if (dp[sum] != -1)
            return dp[sum];
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            if (coins[i] <= sum) {
                int sub_res = minCoinsUtil(coins, m, sum - coins[i], dp);
                if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                    res = sub_res + 1;
            }
        }
        dp[sum] = res;
        return res;
    }

    public static int minCoins(int[] coins, int m, int sum) {
        int[] dp = new int[sum + 1];
        Arrays.fill(dp, -1);
        return minCoinsUtil(coins, m, sum, dp);
    }

    public static void main(String[] args) {
        int[] coins = { 9, 6, 5, 1 };
        int m = coins.length;
        int sum = 11;

        int res = minCoins(coins, m, sum);
        if (res == Integer.MAX_VALUE)
            res = -1;
        System.out.println("Minimum coins required is "
                + res);
    }
} */

