/* Implement a code in java in which we are Given are N boards of with length of each given in the form of array, and K painters, 
such that each painter takes 1 unit of time to paint 1 unit of the board. The task is to find the minimum time to paint all boards 
under the constraints that any painter will only paint continuous sections of boards, say board {2, 3, 4} or only board {1} or 
nothing but not board {2, 4, 5}. 

Input: N = 4, A = {10, 10, 10, 10}, K = 2 

Output : 20

Explanation: Here we can divide the boards into 2 equal sized partitions (Painter 1 will paint boards A1 and A2, 
and Painter 2 will paint boards A3 and A4). So each painter gets 20 units of board and the total time taken is 20. 

Approach 1 - Dynamic Programming approach, recursive approach*/

public class P03_Painters_probelm {
    static int sum(int arr[] , int from , int to) {
        int total =0;
        for(int i =from;i<=to;i++)
            total += arr[i];
        return total;
    }
    static int partition(int arr[] , int n , int k) {
        if(k==1) return sum(arr,0,n-1);
        if(n==1) return arr[0];

        int best = Integer.MAX_VALUE;

        for(int i =0;i<=n;i++) 
            best = Math.min(best, Math.max(partition(arr, i, k - 1), sum(arr,i,n-1)));
        return best;
    }
    public static void main(String[] args) {
        int arr[] = { 10, 20, 60, 50, 30, 40 };
 
        int n = arr.length;
        int k = 3;
        System.out.println(partition(arr, n, k));
    }
}
