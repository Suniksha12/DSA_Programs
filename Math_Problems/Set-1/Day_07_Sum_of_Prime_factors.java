//Implement the code in java for calculating the Sum of Prime fators in java.
/* Naives Approach with Time complexity : O(n * sqrt(n)) */

/* 
import java.util.*;

public class Day_07_Sum_of_Prime_factors {
    static boolean isPrime(int n) {
        if(n<=1)
           return false;
        if(n<=3)
           return true;
        if(n % 2 == 0 || n % 3 == 0)
           return false;
        for(int i = 5;i * i<=n;i=i+6)
            if(n%i == 0 || n%(i+2)==0)
               return false;
        return true;
    }
    static int sumofprimefactors(int n) {
        int sum =0;
        for(int i =1;i<=n;i++) {
            if(n%i==0) {
                if(isPrime(i))
                   sum += i;
            }
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = in.nextInt();
        System.out.println(sumofprimefactors(n));
    }
} */

/* Using Sieve of Eratosthenes an Efficient Approach with Time complexity : O(n*log(n)) */

/* 
import java.util.*;
class Day_07_Sum_of_Prime_factors {
    static int Sum(int N) {
        int sumofprimefactors[] = new int[N+1];
        for(int i =2;i<=N;i++) {
            if(sumofprimefactors[i]==0) {
                for(int j =i;j<=N;j+=i) {
                    sumofprimefactors[j] += i;
                }
            }
        }
        return sumofprimefactors[N];
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int N = in.nextInt();
        System.out.println(Sum(N));
    }
}
*/

// An Efficient Approach for bringing out the pairs, with Time complexity : O(sqrt(N) * sqrt(N))

import java.util.*;

public class Day_07_Sum_of_Prime_factors {
    static boolean isPrime(int n) {
        if(n<=1)
           return false;
        if(n <= 3)
           return true;
        if(n%2 == 0 || n %3==0)
           return false;
        for(int i =5;i*i<=n;i=i+6)
           if(n%i == 0||n%(i+2)==0)
              return false;
        return true;
    }
    static int sumofprimefactors(int n) {
        int sum =0;
        int root_n = (int)Math.sqrt(n);
        for(int i = 1;i<=root_n;i++) {
            if(n % i ==0) {
                if(i == n /i && isPrime(i)) {
                    sum += i;
                } else {
                    if(isPrime(i)) {
                        sum += i;
                    }
                    if(isPrime(n/i)) {
                        sum += (n/i);
                    }
                }
            }
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println(sumofprimefactors(n));
    }
}