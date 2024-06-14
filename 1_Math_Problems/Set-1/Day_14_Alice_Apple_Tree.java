//Implement a code in java to find the Minimum number of Apples to be collected from trees to gurantee M red Apples.

/* There are different kinds of apple trees in the four directions (East, West, North, South), 
which may grow both red and green apples such that each tree grows exactly K apples, in the following manner:

N – number of trees to the north does not have red apples.
S – number of trees to the south does not have green apples.
W – number of trees in the west has some red apples.
E – number of trees in the east have some green apples.
However, the colors of apples cannot be distinguished outside the house.
So, the task is to find the minimum number of apples to be collected from the trees to guarantee M red apples. If it is not possible, print -1. 

Time Complexity - O(1)
Space Complexity - O(1) */


import java.util.*;
public class Day_14_Alice_Apple_Tree {
    static int minApples(int M,int K,int N, int S, int W, int E) {
        if(M<=S*K) 
           return M;
        if(M<=S*K+E+W) 
           return S*K +(M-S*K)*K;
        else 
           return -1;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the No of red Apples: ");
        int M = in.nextInt();
        System.out.print("Enter a total number of Apples: ");
        int K = in.nextInt();
        System.out.print("Enter number of apples in North: ");
        int N = in.nextInt();
        System.out.print("Enter number of apples in South: ");
        int S = in.nextInt();
        System.out.print("Enter number of apples in west: ");
        int W = in.nextInt();
        System.out.print("Enter number of apples in East: ");
        int E = in.nextInt();

        int ans = minApples(M, K, N, S, W, E);
        System.out.print(ans);
    }
}
