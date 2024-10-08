/*Implement code in java in which we need to Consider a row of N coins of values V1 . . . Vn, where N is even. We play a game against an opponent by alternating turns. In each turn, a player selects either the first or last coin from the row, removes it from the row permanently, and receives the value of the coin. Determine the maximum possible amount of money we can definitely win if we move first.

Note: The opponent is as clever as the user.

Examples:

Input: {5, 3, 7, 10}
Output: 15 -> (10 + 5) 

Approach - 1 Optimal Strategy for a Game using memoization
Time Complexity : O(n^2)
Space Complexity : O(n^2)*/

/* 
import java.util.ArrayList;
import java.util.HashMap;

public class P02_Optimal_Strategy_for_Game {
    static ArrayList<Integer> arr = new ArrayList<>();
    static HashMap<ArrayList<Integer>,Integer> memo = new HashMap<>();
    static int n =0;

    static int solve(int i , int j){
        if((i>j) || (i>=n) ||(j<0))
           return 0;
        ArrayList<Integer> k = new ArrayList<Integer>();
        k.add(i);
        k.add(j);
        if(memo.containsKey(k))
           return memo.get(k);

        int option1 = arr.get(i) + Math.min(solve(i+2,j),solve(i,j-2));

        int option2 = arr.get(j) + Math.min(solve(i+1, j-1), solve(i,j-2));

        memo.put(k,Math.max(option1,option2));
        return memo.get(k);
    }
    static int optimalStrategyOfGame(){
        memo.clear();
        return solve(0,n-1);
    }
    public static void main(String[] args) {
        arr.add(8);
        arr.add(15);
        arr.add(3);
        arr.add(7);
        n = arr.size();
        System.out.println(optimalStrategyOfGame());
 
        arr.clear();
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        n = arr.size();
        System.out.println(optimalStrategyOfGame());
 
        arr.clear();
        arr.add(20);
        arr.add(30);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(10);
        n = arr.size();
        System.out.println(optimalStrategyOfGame());
    }
} */

/*Approach - 2 Optimla Strategy for a Game using DP
 * 
 * Time Complexity : O(n^2)
 * Space Complexity : O(n^2)
 */

 public class P02_Optimal_Strategy_for_Game {
    static int optimalStrategyOfGame(int arr[] , int n){
        int table[][] = new int[n][n];
        int gap,i,j,x,y,z;

        for(gap=0;gap<n;++gap){
            for(i=0,j=gap;j<n;++i,++j){
                x = ((i+2)<=j) ? table[i+2][j]:0;
                y = ((i+1)<=(j-1)) ? table[i+1][j-1]:0;
                z = (i<=(j-2)) ? table[i][j-2]:0;

                table[i][j] = Math.max(arr[i] + Math.min(x,y), arr[j] + Math.min(y,z));
            }
        }
        return table[0][n-1];
    }
    public static void main(String[] args) {
        int arr1[] = { 8, 15, 3, 7 };
        int n = arr1.length;
        System.out.println(
            "" + optimalStrategyOfGame(arr1, n));
 
        int arr2[] = { 2, 2, 2, 2 };
        n = arr2.length;
        System.out.println(
            "" + optimalStrategyOfGame(arr2, n));
 
        int arr3[] = { 20, 30, 2, 2, 2, 10 };
        n = arr3.length;
        System.out.println(
            "" + optimalStrategyOfGame(arr3, n));
    }
 }