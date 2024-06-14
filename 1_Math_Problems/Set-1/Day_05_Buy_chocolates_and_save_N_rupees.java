// implement java program on Buy chocolates and save N rupees

/*Question is : Geek wants to buy chocolates. The shop only has two types of chocolates. One costs 3 rupees and the other cost 7 rupees. Geek has 100 rupees. Is it possible for him to save exactly N rupees after visiting the shop?
 * eg : N = 99
 *     output : 0
 * 
 * Time complexity : O(N)
 * Space Complexity : O(1)
 */

import java.util.*;
public class Day_05_Buy_chocolates_and_save_N_rupees {
    static int isPossible(int N){
        int totalMoney = 100;
        int remainingMoney = totalMoney - N;
         
        //when the input given by the user is 0
        if(N==0) {
            return 1;
        }

        //Think of the possibility of combinations of 3 and 7.
        for(int i =0;i*3<=remainingMoney;i++) {
            if((remainingMoney - i * 3)%7 == 0)
               return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int N = in.nextInt();
        System.out.println(isPossible(N));
    }
}
