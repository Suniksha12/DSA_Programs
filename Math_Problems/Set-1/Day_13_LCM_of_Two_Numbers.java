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

/*  */