/* Implement Code in java to print the interesting patterns programs.
 * Time Complexity : O(n^2)
 * Space Complexity : O(1)
*/

public class P08_Interesting_Pattern {
    static void pattern(int n)
    {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (2 * n); j++) {
                if (i > (n - j + 1))
                    System.out.print(" ");
                else
                    System.out.print("*");
                if ((i + n) > j)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
             
            System.out.println("");
        }

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (2 * n); j++) {

                if (i < j)
                    System.out.print(" ");
                else
                    System.out.print("*");

                if (i <= ((2 * n) - j))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
             
            System.out.println("");
        }
    }
    public static void main(String[] args)
    {
        pattern(7);
    }
}