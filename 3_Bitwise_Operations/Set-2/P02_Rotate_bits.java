/*Implement Code in java in which Bit Rotation: A rotation (or circular shift) is an operation similar to shift except that the bits that fall off at one end are put back to the other end. 
In left rotation, the bits that fall off at left end are put back at right end. 
In right rotation, the bits that fall off at right end are put back at left end.

Example: 
Let n is stored using 8 bits. Left rotation of n = 11100101 by 3 makes n = 00101111 (Left shifted by 3 and first 3 bits are put back in last ). If n is stored using 16 bits or 32 bits then left rotation of n (000…11100101) becomes 00..0011100101000. 
Right rotation of n = 11100101 by 3 makes n = 10111100 (Right shifted by 3 and last 3 bits are put back in first ) if n is stored using 8 bits. If n is stored using 16 bits or 32 bits then right rotation of n (000…11100101) by 3 becomes 101000..0011100. 

For 32 bits number 

Time Complexity : O(1)

Space Complexity : O(1)*/

public class P02_Rotate_bits {
   static final int INT_BITS = 32;

   static int leftRotate(int n , int d) {
    return (n<<d) | (n >> (INT_BITS - d));
   }
   static int rightRotate(int n , int d) {
    return (n>>d) | (n <<(INT_BITS - d));
   }
   public static void main(String arg[]) 
{
    int n = 16;
    int d = 2;
    System.out.print("Left Rotation of " + n +
                          " by " + d + " is ");
    System.out.print(leftRotate(n, d));
     
    System.out.print("\nRight Rotation of " + n +
                             " by " + d + " is ");
    System.out.print(rightRotate(n, d));
}
}
