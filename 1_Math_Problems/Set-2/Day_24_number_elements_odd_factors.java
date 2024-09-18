//Implement Code in java

/* Given a range [n,m], find the number of elements that have odd number of factors in the given range (n and m inclusive). 
Examples : 
 

Input  : n = 5, m = 100
Output : 8
The numbers with odd factors are 9, 16, 25, 
36, 49, 64, 81 and 100 

Approach Used - An Efficient Solution is to observe the pattern. Only those numbers, which are perfect Squares have an odd number of factors.

Time Complexity : O(1)
Space compelxity : O(1)*/

import java.util.*;
public class Day_24_number_elements_odd_factors {
    static int perfectoddsquares(int n , int m) {
        return (int)Math.pow((double)m,0.5) - (int)Math.pow((double)n-1,0.5);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = in.nextInt();
        System.out.print("Enter a Number : ");
        int m = in.nextInt();
        System.out.print("Count is " + perfectoddsquares(n, m));
        in.close();
    }
}
