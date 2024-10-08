/*Implement Code in java in which we have The following is a description of the instance of this famous puzzle involving N = 2 eggs and a building with K = 36 floors.
Suppose that we wish to know which stories in a 36-story building are safe to drop eggs from, and which will cause the eggs to break on landing. We make a few assumptions:

An egg that survives a fall can be used again. 
A broken egg must be discarded. 
The effect of a fall is the same for all eggs. 
If an egg breaks when dropped, then it would break if dropped from a higher floor. 
If an egg survives a fall then it would survive a shorter fall. 
It is not ruled out that the first-floor windows break eggs, nor is it ruled out that the 36th-floor does not cause an egg to break.
If only one egg is available and we wish to be sure of obtaining the right result, the experiment can be carried out in only one way. Drop the egg from the first-floor window; if it survives, drop it from the second-floor window. Continue upward until it breaks. In the worst case, this method may require 36 droppings. Suppose 2 eggs are available. What is the least number of egg droppings that are guaranteed to work in all cases? 
The problem is not actually to find the critical floor, but merely to decide floors from which eggs should be dropped so that the total number of trials is minimized.

Note: In this post, we will discuss a solution to a general problem with ‘N’ eggs and ‘K’ floors

Approach - 1 Using Recursion
Time Complexity : Exponential
Space Complexity : O(1)*/

/* 
public class P01_Egg_Dropping_puzzle {
    static int eggDrop(int n , int k){
        if(k==0 || k==1)
           return k;
        if(n==1)
           return k;
        int min = Integer.MAX_VALUE;
        int x,res;

        for(x=1;x<=k;x++){
            res = Math.max(eggDrop(n-1,x-1),eggDrop(n, k-x));
            if(res<min)
               min=res;
        }
        return min+1;
    }
    public static void main(String[] args) {
        int n = 2, k = 10;
        System.out.print("Minimum number of "
                         + "trials in worst case with " + n
                         + " eggs and " + k + " floors is "
                         + eggDrop(n, k));
    }
}
*/

/*Approach - 2 Dynamic Programming
 * 
 * Time Complexity : O(N*k^2)
 * Space Complexity : O(N*k^2)
 */

 /* 
 public class P01_Egg_Dropping_puzzle {
    static int max(int a , int b){
        return (a>b)?a:b;
    } 
    static int eggDrop(int n , int k){
        int eggFloor[][] = new int[n+1][k+1];
        int res;
        int i, j,x;

        for(i=1;i<=n;i++){
            eggFloor[i][1] = 1;
            eggFloor[i][0] = 0;
        }
        for(j=1;j<=k;j++)
           eggFloor[1][j] = j;

        for(i=2;i<=n;i++){
            for(j=2;j<=k;j++){
                eggFloor[i][j] = Integer.MAX_VALUE;
                for(x=1;x<=j;x++){
                    res=1 + Math.max(eggFloor[i-1][x-1],eggFloor[i][j-x]);
                    if(res < eggFloor[i][j])
                       eggFloor[i][j] = res;
                }
            }
        }
        return eggFloor[n][k];
    }
    public static void main(String[] args) {
        int n = 2, k = 36;
        System.out.println(
            "Minimum number of trials in worst"
            + " case with " + n + "  eggs and " + k
            + " floors is " + eggDrop(n, k));       
    }
 }*/

/*Approach - 3 
 * Time Complexity : O(N*K)
 * Space Complexity : O(N*K)
 */

 public class P01_Egg_Dropping_puzzle {
    static int minTrials(int n , int k){
          int dp[][] = new int[k+1][n+1];
          int m =0;
          while(dp[m][n]<k){
            m++;
            for(int x = 1;x<=n;x++){
                dp[m][x] = 1+dp[m-1][x-1] + dp[m-1][x];
            }
          }
        return m;  
    }
    public static void main(String[] args) {
        int n = 2, k = 36;
        System.out.println("Minimum number of trials "
                + "in worst case with " + n + " eggs and "
                + k + " floors is "+ minTrials(2, 36));
    }
 }