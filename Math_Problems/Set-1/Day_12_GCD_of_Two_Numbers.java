//Implement a java code to find the Greatest common Divisor of Two Numbers 
/*The approach we are using here is , Niave approach in which we will find the minimum between two numbers 
 * and return the highest factor amomg them.
 */

/* 
import java.util.*;

public class Day_12_GCD_of_Two_Numbers {
    static int gcd(int a, int b) {
        int result = Math.min(a,b);
        while(result > 0) {
            if(a%result ==0 && b %result ==0)
               break;
            result--;
        }
       return result; 
    }    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = in.nextInt();
        System.out.print("Enter a number : ");
        int b = in.nextInt();
        System.out.println(gcd(a, b));
    }
}
*/

/*Euclidean Approach - in which we will subtract in order to carry the result forwrad unless we get 1 */

/* 
import java.util.*;

public class Day_12_GCD_of_Two_Numbers {
    static int gcd(int a, int b) {
       if(a==0)
          return b;
       if(b==0)
        return a;
       if(a>b) {
        return gcd(a-b,b);
       } else {
        return gcd(a,b-a);
       }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = in.nextInt();
        System.out.print("Enter a number : ");
        int b = in.nextInt();
        System.out.println(gcd(a, b));
    }
} */

/* Implementing GCD using divisiblity with Time Complexity : O(log(min(a,b))) */

import java.util.*;
public class Day_12_GCD_of_Two_Numbers {
    static int gcd(int a, int b){
        if(b==0) 
           return a;
        return gcd(b, a%b);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = in.nextInt();
        System.out.print("Enter a number : ");
        int b = in.nextInt();
        System.out.println(gcd(a, b));
    }
}
