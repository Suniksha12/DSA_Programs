/* Implement code in java to perform the bitwise operators. 
 * Time Complexity : O(1)
 * Space Complexity : O(1)
*/

/*
public class Bitwise_Operators {
   public static void main(String[] args) {
    int a = 5;
    int b = 7;

    System.out.println("a&b = " + (a&b));

    System.out.println("a|b = " + (a|b));

    System.out.println("a^b = " + (a^b));

    System.out.println("~a = " + ~a);

    a &= b;
    System.out.println("a = " + a);
   } 
} */

/*Bitwise logical operators */

/*public class Bitwise_Operators {
    public static void main(String[] args) {
        String binary[]={
            "0000","0001","0010","0011","0100","0101",
            "0110","0111","1000","1001","1010",
            "1011","1100","1101","1110","1111"
          };

          int a = 3;
          int b = 6;
          //bitwise or
          int c = a|b;
          //bitwise and
          int d = a&b;
          //bitwise xor
          int e = a^b;
          //bitwise not
          int f = (~a & b) | (a & ~b);
          int g = ~a & 0x0f;

          System.out.println(" a = " + binary[a]);
          System.out.println(" b = " + binary[b]);
          System.out.println(" a|b = " + binary[c]);
          System.out.println(" a&b = " + binary[d]);
          System.out.println(" a^b = " + binary[e]);
          System.out.println(" ~a&b|a&~b = " + binary[f]);
          System.out.println(" ~a = " + binary[g]);
    }
} */

/* Bit Shift Operators */

import java.util.Scanner;

public class Bitwise_Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Bitwise AND: " + (num1 & num2));
        System.out.println("Bitwise OR: " + (num1 | num2));
        System.out.println("Bitwise XOR: " + (num1 ^ num2));
        System.out.println("Bitwise NOT: " + (~num1));
        System.out.println("Bitwise left Shift: " + (num1 << 2));
        System.out.println("Bitwise right Shift: " + (num1 >> 2));
        System.out.println("Bitwise unsigned Right shift: " + (num1 >>> 2));
        input.close();
    }
}

