//Implement a code in java

/* Given a set of digits S and an integer N, the task is to find the smallest positive integer if exists which contains only 
the digits from S and is a multiple of N. Note that the digits from the set can be used multiple times. 
Examples:
Input: S[] = {5, 2, 3}, N = 12 Output: 252 We can observe that 252 is formed using {2, 5} and is a multiple of 12 

Time Complexity : O(N*M)
Space Complexity : O(N)*/

import java.util.*;

public class Day_02_Smalllest_Multiple {
    static int smallest(ArrayList<Integer> arr , int n) {
        ArrayList<Integer> dp = new ArrayList<Integer>();
        for(int i =0;i<n;i++)
            dp.add(Integer.MAX_VALUE - 5);
        
        ArrayList <ArrayList<Integer>> result = new ArrayList <ArrayList<Integer>>();
        for(int i =0;i<n;i++) 
            result.add(new ArrayList<Integer>(Arrays.asList(-1,0)));
        
        Collections.sort(arr);

        ArrayList<Integer> q = new ArrayList<Integer>();
        for(int i : arr) {
            if(i!=0) {
                if(dp.get(i%n)>1000000000) {
                    q.add(i%n);
                    dp.set(i%n,1);
                    result.set(i%n, new ArrayList<Integer>(Arrays.asList(-1,i)));
                }
            }
        }
        while(q.size() != 0) {
            int u = q.get(0);
            q.remove(0);
            for(int i : arr) {
                int v = (u * 10 + i) % n;

                if(dp.get(u) + 1 < dp.get(v)) {
                    dp.set(v,dp.get(u)+1);
                    q.add(v);
                    result.set(v,new ArrayList<Integer>(Arrays.asList(u ,i)));
                }
            }
        }
        if(dp.get(0) > 1000000000)
           return -1;
        else {
            ArrayList<Integer> ans = new ArrayList<Integer>();
            int u =0;
            while(u != -1) {
                ans .add(result.get(u).get(1));
                u = result.get(u).get(0);
            }
            Collections.reverse(ans);
            for(int i : ans) {
                return i;
            }
        }
        return -1;
    }
    public static void mian(String args[]) {
      Scanner in = new Scanner(System.in);
      ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(5,2,3));
      System.out.print("Enter the number: ");
      int n = in.nextInt();
      System.out.print(smallest(arr, n));
    }
}
