/*Implement Code in java Such that we are Given a two positive integer a and b you have to change a to b by applying any of the three operations on binary form of a. You can select ai and aj (any two bits where i!=j) from binary form of a and then perform operation as: 
 

AND operation as : temp = ai & aj, ai = temp & ai, aj = temp & aj
OR operation as : temp = ai | aj, ai = temp | ai, aj = temp | aj
XOR operation as : temp = ai ^ aj, ai = temp ^ ai, aj = temp ^ aj
where & = bitwise AND, | = bitwise OR and ^ = bitwise XOR. 
Find the minimum operation required for conversion of a to b. Also, if conversion of a to b is not possible then print -1.
Examples: 
 

Input : a = 12 (1100), b = 10 (1010)
Output : 1
Explanation : select a2 and a3 and perform XOR

Time Complexity – O(K)

Space Complexity – O(K)*/

public class P08_Minimum_Bitwise_operations {
    static String leftPad(String input , int length, String fill) {
        String pad = String.format("%" + length + "s", "")
        .replace(" ", fill)
        + input.trim();
      return pad.substring(pad.length() - length,
                           pad.length());
    }
    static int minOp(int a , int b) {
        String a1 = leftPad((Integer.toBinaryString(a)), 32, "0");
        String b1 = leftPad((Integer.toBinaryString(b)), 32, "0");
        if(a1==b1) return 0;
        if(Integer.parseInt(a1,2)==0) return -1;
        if((Integer.parseInt(a1,2) & (Integer.parseInt(a1,2) + 1)) == 0) return -1;

        int n =0;
        int m =0;
        for(int i =0;i<b1.length();i++) {
            if(b1.charAt(i) != a1.charAt(i)) {
                if(a1.charAt(i) == '1') 
                   n += 1;
                else   
                   m += 1;
            }
        }
        return Math.max(n,m);
    }
    public static void main(String[] args)
  {
    int a = 14;
    int b = 1;
    System.out.print(minOp(a, b));
  } 
}
