/*Implement code in java in which we have Given an infinite supply of each denomination of Indian currency { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 } and a target value N.
Find the minimum number of coins and/or notes needed to make the change for Rs N. You must return the list containing the value of coins required. 


Example 1:

Input: N = 43
Output: 20 20 2 1
Explaination: 
Minimum number of coins and notes needed 
to make 43. 

Time Complexity : O(N)
Space Complexity : O(N)*/

import java.util.ArrayList;
import java.util.List;

public class P02_Minimum_number_coins {
    static List<Integer> minPartition(int N)
    {
        int currency[] = {2000,500,200,100,50,20,10,5,2,1};
        List<Integer> ans = new ArrayList<>();
        int i=0;
        while(N>0){
            int times = N/currency[i];
            while(times>0){
                ans.add(currency[i]);
                times--;
            }
       N %= currency[i];
       i++; 
    }
    return ans;
  }
  public static void main(String[] args) {
    int N=43;
    System.out.print(minPartition(N));
  }
}
