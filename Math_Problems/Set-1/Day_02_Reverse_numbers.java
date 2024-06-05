// Java Program to Reverse a number with Time Complexity of O(n) and space complexity of O(1)

import java.util.*;

public class Day_02_Reverse_numbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int sum =0;
        int n = in.nextInt();
        while(n!=0) {
            int r = n%10;
            sum = sum *10 + r;
            n = n/10;
        }
        System.out.println("Reversed Number is : "+ sum);
    }
}
