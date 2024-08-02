/*Implement Code in java in which Stickler the thief wants to loot money from a society having n houses in a single line. He is a weird person and follows a certain rule when looting the houses. According to the rule, he will never loot two consecutive houses. At the same time, he wants to maximize the amount he loots. The thief knows which house has what amount of money but is unable to come up with an optimal looting strategy. He asks for your help to find the maximum money he can get if he strictly follows the rule. ith house has a[i] amount of money present in it.

Example 1:

Input:
n = 5
a[] = {6,5,5,7,4}
Output: 
15
Explanation: 
Maximum amount he can get by looting 1st, 3rd and 5th house. Which is 6+5+4=15.

Time Complexity : O(N)

Space Complexity : O(1)*/

public class P01_Stickler_thief {
   static int FindMaxSum(int arr[], int n) {
    if(n==0) return 0;
    if(n==1)  return arr[0];
    if(n==2) return Math.max(arr[0],arr[1]);

    int dp[] = new int[n];
    dp[0] = arr[0];
    dp[1] = Math.max(arr[0],arr[1]);

    for(int i =2;i<n;i++) {
        dp[i] = Math.max(dp[i-1],dp[i-2] + arr[i]);
    }
    return dp[n-1];
   }
   public static void main(String[] args) {
     int n =3;
     int[] a = {1,5,3};
     System.out.println(FindMaxSum(a,n));
   }
    
}