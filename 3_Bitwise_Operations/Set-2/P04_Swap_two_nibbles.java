/*Implement Code in java in which we are 
Given a byte, swap the two nibbles in it. For example, 
100 is represented as 01100100 in a byte (or 8 bits). 

The two nibbles are (0110) and (0100). If we swap the two nibbles, 
we get 01000110 which is 70 in decimal. 

Time Complexity : O(1)

Space Complexity : O(1)*/


public class P04_Swap_two_nibbles {
    static int swapNibbles(int x) {
        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
    }
    public static void main(String arg[])
    {
    int x = 100;
    System.out.print(swapNibbles(x));
    }
}
