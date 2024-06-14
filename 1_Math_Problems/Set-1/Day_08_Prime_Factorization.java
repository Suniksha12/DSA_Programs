// Implement a java program to print all Prime Factors of a Given Number, with Time complexity of O(sqrt(n))

import java.util.*;

public class Day_08_Prime_Factorization {
    public static void primefactors(int n) {
        while(n % 2 ==0) {
            System.out.println( 2 + " ");
            n /= 2;
        }
        for(int i =3;i<=Math.sqrt(n); i += 2) {
            while(n % i == 0) {
                System.out.println(i + " ");
                n /= i;
            }
        }
        if(n>2)
           System.out.println(n);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = in.nextInt();
        primefactors(n);
    }
}
