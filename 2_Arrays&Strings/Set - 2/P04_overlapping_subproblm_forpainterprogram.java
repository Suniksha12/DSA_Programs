/*implement a code in java in which we will be using the Dynamic approach for thr painters problem 
but using bottum up tabular approach.

Time Complexity : O(k*N^3)
Space Complexity : O(k * N)
 */

public class P04_overlapping_subproblm_forpainterprogram {
    static int sum(int arr[], int from , int to) {
        int total =0;
        for(int i= from ;i <= to ; i++)
            total += arr[i];
        return total;
    }
    static int findMax(int arr[] , int n, int k) {
        int dp[][] = new int[k+1][n+1];

        //k==1
        for(int i =1;i<=n;i++) 
            dp[1][i] = sum(arr, 0, i-1);

        //n==1
        for(int i =1;i<=k;i++) 
            dp[i][1] = arr[0];
        
        for(int i =2;i<=k;i++) {
            for(int j = 2;j<=n;j++) {
                int best = Integer.MAX_VALUE;

                for(int p =1;p<=j;p++) 
                    best = Math.min(best, Math.max(dp[i-1][p], sum(arr,p,j-1)));
                
         dp[i][j] = best;
        }
     }
    return dp[k][n];
    }
    public static void main(String[] args) {
        int arr[] = { 10, 20, 60, 50, 30, 40 };
 
        // Calculate size of array.
        int n = arr.length;
        int k = 3;
        System.out.println(findMax(arr, n, k));
    }
}
