// Implement a java program to find out the factors of a given number in java. 

/* we will use two approach naive approach with Time Compelxity of O(n) and space complexity of O(1). */
/* 
import java.util.*;
public class Day_06_factors_of_a_given_Number {
    static void factors(int N) {
        for(int i =1;i<= N;i++)
            if(N % i == 0) 
               System.out.print(i + " ");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int N = in.nextInt();
        factors(N);
    }
} */

/* Case 1: what if we arise with a condition where we get same divisor we want the above programs in pair, for the above factors probelm so here the Time complexity we will choose is O(sqrt(n)) and time complexity is O(1). */

import java.util.*;
public class Day_06_factors_of_a_given_Number {
    static void factors(int N) {
        for(int i = 1;i<Math.sqrt(N);i++) {
            if(N%i==0) {
                if(N/i == i)
                   System.out.println(" " + i);
                else 
                   System.out.println(i + " " + N/i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int N = in.nextInt();
        factors(N);
    }
}
