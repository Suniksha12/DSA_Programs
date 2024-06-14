//Implement a program in java to calculate the LCM 
/* We will use the following formula LCM(a, b) = (a / GCD(a, b))xb 
 * with Time Complexity and space complexity : O(log(min(a,b))
*/

/* 
import java.util.*;
public class Day_13_LCM_of_Two_Numbers {
    static int gcd(int a , int b) {
        if(a==0)
           return b;
        return gcd(b%a,a);
    }
    static int LCM(int a , int b) {
        return (a/gcd(a,b))*b;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = in.nextInt();
        System.out.print("Enter a Number : ");
        int b = in.nextInt();
        System.out.print(LCM(a,b));

    }
} */

/* Next we can solve using conditional for loop with 
 * Time Complexity : O(min(a,b))
 * Space Complexity : O(1)
 */

import java.util.*;
public class Day_13_LCM_of_Two_Numbers {
    public static int findLCM(int a , int b) {
        int greater = Math.max(a,b);
        int smallest = Math.min(a,b);
        for(int i = greater;;i += greater) {
            if(i % smallest == 0)
               return i;
        }

    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = in.nextInt();
        System.out.print("Enter a Number : ");
        int b = in.nextInt();
        int lcm = findLCM(a, b);
        System.out.print(lcm);
    }
}