// Java Program for Calculating prime numbers and we have space complexity of O(sqrt(n)) 
// and Time Complexity of O(n)

import java.util.*;
public class Day_01_Prime_numbers {

    static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        else if(n==2)
            return true;
        else if (n%2==0)
            return false;
        
            for(int i =3;i<=Math.sqrt(n);i+=2) {
                if(n%i==0) {
                    return false;
                }
            }
            return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Starting Number:");
        int start = in.nextInt();
        System.out.println("Enter the Ending Number:");
        int end = in.nextInt();
        for(int i = start;i<=end;i++) {
            if(isPrime(i))
            System.out.println(i);
        }
    } 
}