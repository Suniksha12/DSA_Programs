/*Implement Code in java such that we have The task is to count all the possible paths from top left to bottom right of a m x n matrix with 
the constraints that from each cell you can either move only to right or down.

Input: 

First line consists of T test cases. First line of every test case consists of N and M, 
denoting the number of rows and number of columns respectively.

Output: 

Single line output i.e count of all the possible paths from top left to bottom right of a m x n matrix.. 

*/

import java.util.*;
public class P02_maneuvering_cave_problem {
    static int path(int m , int n) {
        if(m==1 || n == 1) 
           return 1;
        return path(m-1,n) + path(m,n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter number of test Cases:");
        c = in.nextInt();
        while(c-->0) {
            System.out.println("Enter number of rows and columns : ");
            a=in.nextInt();
            b=in.nextInt();

            System.out.println(path(a,b));
        }
      in.close();
    }
}
