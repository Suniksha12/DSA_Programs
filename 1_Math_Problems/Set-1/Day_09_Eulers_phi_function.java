//Implement java code in Eulers totient function
/* A simple solution is to iterate through all numbers 
from 1 to n-1 and count numbers with gcd with n as 1. 
 With Time complexity as O(n^2 Log N). */

/*import java.util.*;

public class Day_09_Eulers_phi_function {
    static int gcd(int a , int b) {
        if(a==0)
           return b;
        return gcd(b%a,a);
    }
    static int phi(int n) {
        int result = 1;
        for(int i =2;i<n;i++)
            if(gcd(i,n)==1)
               result++;
        return result;
    }
    public static void main(String args[]) {
        int n;
        for (n = 1; n <= 10; n++)
            System.out.println("phi(" + n + ") = " + phi(n));
    }
} */

/* Better solution is to solve the Eulers product Formula. 
 * Time Complexity : O(n log n)
 * Space Complexity : O(1)
*/

/* 
import java.util.*;

public class Day_09_Eulers_phi_function {
    static int phi(int n) {
        float result = n;
        for(int p =2;p*p<=n;++p) {
            if(n%p==0) {
                while (n%p==0)
                    n /=p;
                    result *= (1.0-(1.0/(float)p));
            }
        }
            if(n>1) 
               result -= result / n;
               return (int)result;
        }
        public static void main(String args[]) {
            int n;
            for(n=1;n<=10;n++) 
            System.out.println("phi(" + n + ") = " + phi(n));
        }
} */

/* The idea is to count all prime factors and their multiples and subtract this count from n to get the totient function value 
 * Time Complexity : O(n log n)
 * Space Complexity : O(1)
 */

import java.util.*;

public class Day_09_Eulers_phi_function {
    static int phi(int n) {
        int result = n;
        for(int p =2;p*p<=n;++p) {
            if(n%p==0) {
                while(n%p==0)
                     n /= p;
                result -= result/p;
            }
        }
        if(n>1) 
           result -= result / n;
        return result;
    }
    public static void main(String args[]) {
        
    int n;
    for (n = 1; n <= 10; n++)
        System.out.println("phi(" + n + 
                           ") = " + phi(n));
    }
}