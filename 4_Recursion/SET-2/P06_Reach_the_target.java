/*Implement Code in java in which You are standing at position 0 on an infinite number line. There is a destination at position target.

You can make some number of moves numMoves so that:

On each move, you can either go left or right.
During the ith move (starting from i == 1 to i == numMoves), you take i steps in the chosen direction.
Given the integer target, return the minimum number of moves required (i.e., the minimum numMoves) to reach the destination.

 

Example 1:

Input: target = 2
Output: 3
Explanation:
On the 1st move, we step from 0 to 1 (1 step).
On the 2nd move, we step from 1 to -1 (2 steps).
On the 3rd move, we step from -1 to 2 (3 steps).

Time cOmplexity : O(target)
Space Complexity : O(1)*/

public class P06_Reach_the_target {
    public static int reachNumber(int target){
        target = Math.abs(target);
        int sum =0;
        int step =0;
        while(sum < target){
            step++;
            sum += step;
        }
        while((sum - target) % 2 != 0) {
            step++;
            sum += step;
        }
        return step;
    }
    public static void main(String[] args) {
        int target = 2;
        System.out.println(reachNumber(target));
    }
}
