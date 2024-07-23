/*Implement Code in java in which There are N houses built in a line, each of which contains some value in it. A thief is going to steal the maximum value of these houses, but he can’t steal in two adjacent houses because the owner of the stolen houses will tell his two neighbors left and right sides. The task is to find what is the maximum stolen value.

Examples: 

Input: hval[] = {6, 7, 1, 3, 8, 2, 4}
Output: 19
Explanation: The thief will steal 6, 1, 8 and 4 from the house.

Approach - Naive Approach

Time Complexity:  O(2^N)
Time Complexity:  O(2^N)*/

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
