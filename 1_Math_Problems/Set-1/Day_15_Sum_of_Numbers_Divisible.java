//Implement a code in java to take a given number N. 
//The task is to find the sum of all those numbers from 1 to N that are divisible by 3 or by 5.

/* We are following up the Arithemtic Progression series problem and using that formula below program is formed.
 * Time Complexity : O(1)
 * Space Complexity : O(1)
 */

import java.util.*;
public class Day_15_Sum_of_Numbers_Divisible {
    static int series(int N) {
        int s1,s2,s3;
        s1 = ((N/3)*(2*3+((N/3)-1)*3))/2;
        s2 = ((N/5)*(2*5+((N/5)-1)*5))/2;
        s3 = ((N/15)*(2*15+((N/15)-1)*15))/2;
        return s1+s2-s3;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N = in.nextInt();
        System.out.print(series(N));
    }
}
