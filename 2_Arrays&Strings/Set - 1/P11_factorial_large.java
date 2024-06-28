/* Implement Code in java Find the factorial of a large number. 
 * 
 * Input : 100
 * 
 * output : 933262154439441526816992388562667004-
         907159682643816214685929638952175999-
         932299156089414639761565182862536979-
         208272237582511852109168640000000000-
         00000000000000

         Time complexity : O(N log (N!))
    
    Approach - 1 Basic Approach
 */
/* 
public class P11_factorial_large {
    static void factorial(int n) {
        int res[] = new int[500];
        res[0] = 1;
        int res_size = 1;

        for(int x =2;x<=n;x++)
            res_size = multiply(x,res,res_size);
        
        System.out.println("Factorial of given number is ");
        for(int i = res_size-1;i>=0;i--)
            System.out.print(res[i]);
    }
    static int multiply(int x , int res[], int res_size) {
        int carry =0;
        for(int i =0;i<res_size;i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10;
            carry = prod / 10;
        }
        while(carry != 0) {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }
    public static void main(String args[]) {
        factorial(100);
    }
} */

/* Approach 2 - Using BigInteger */

import java.math.BigInteger;

public class P11_factorial_large {
    static BigInteger factorial(int N) {
         BigInteger f = new BigInteger("1");
         for(int i =2;i<=N;i++)
             f = f.multiply(BigInteger.valueOf(i));

        return f;
    }
    public static void main(String[] args) throws Exception {
        int N = 100;
        System.out.println(factorial(N));
    }
}