/*Implement a code in java Given a number n, find the last non-zero digit in n!.
Examples: 
 

Input  : n = 5
Output : 2
5! = 5 * 4 * 3 * 2 * 1 = 120
Last non-zero digit in 120 is 2. 

Time complexity: O(log n)
Space Complexity : O(log n)*/

public class P02_Last_Non_Zero_Digit {
    static int dig[] = {1, 1, 2, 6, 4, 2, 2, 4, 2, 8};

    static int lastNonDigit(int n) {
        if(n<10)
           return dig[n];

        if(((n/10)%10)%2 == 0)
           return (6*lastNonDigit(n/5) * dig[n%10]) % 10;
        else 
           return (4*lastNonDigit(n/5) * dig[n%10]) % 10;
    }
    public static void main (String[] args)
    {
        int n = 14;
        System.out.print(lastNonDigit(n));
    }
}
