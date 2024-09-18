//Implement a code in java 

/* Given a number ‘n’, how to check if n is a Fibonacci number. First few Fibonacci numbers are 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ..

Examples :
Input : 8
Output : Yes

Time Complexity : O(log N)
Space Complexity : O(1) 

Approach 1 : A number is Fibonacci if and only if one or both of (5*n2 + 4) or (5*n2 – 4) is a perfect square*/

/*
import java.util.*;
public class Day_21_Fibonnaci_Number {
    static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }
    static boolean isFibonacci(int n) {
        return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        for(int i =1;i<=n;i++) {
            System.out.println(isFibonacci(i) ? i + " is a Fibonacci number" :
                                              i + " is not Fibonacci number");
        in.close();
        }
    }
}
*/

/* Approach - 2 : Using While loop */

/*import java.util.*;

public class Day_21_Fibonnaci_Number {
    static boolean isPerfectSquare(int n) {
        int s = (int) Math.sqrt(n);
        return (s*s == n);
    }
    static boolean isFibonacci(int n) {
        if(n==0) {
            return true;
        }
        int a =0,b=1,c=1;
        while(c<n) {
            a = b;
            b = c;
            c = a+b;
        }
        return (c==n || isPerfectSquare(5*n*n+4) || isPerfectSquare(5*n*n-4));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        for(int i =1;i<=n;i++) {
            if(isFibonacci(i)) {
                System.out.println(i + " is a Fibonacci number.");
            } else {
                System.out.println(i + " is not Fibonacci number.");

            }
        }
        in.close();
    }
} */

/* Approach - 3 
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

import java.util.*;

public class Day_21_Fibonnaci_Number {
    static boolean isFibonacci(int N) {
        if(N==0 || N==1)
           return true;
        
        int a = 0, b = 1,c;
        while(true) {
            c = a + b;
            a = b;
            b = c;

            if(c==N)
               return true;
            else if(c>=N) {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = in.nextInt();
        for(int i = 1;i<=n;i++) {
            if(isFibonacci(i)) {
                System.out.println(i+" is a Fibonacci number.");
            } else {
                System.out.println(i+" is not Fibonacci number.");
            }
        }
        in.close();
    }
}