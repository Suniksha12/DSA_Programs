//Implement Code in java 

/*Galios writes the original message in a zig zag pattern and reads of the lines horizontally. For example, IAMSMARTERTHANYOU is written first as and encoded as IEUATROMRTYSAHNMA

Given the number of rows used by Galois to encode the text and the encoded text, write a program to recover the original text. 
Note that if the length of the string is not adequate to complete the pattern, Galois pads it with the character “X” to make up the length. 
These must not appear in the output. 

Input Format:

The first line of the input is the number of rows (depth) Galois used in his coding scheme

The next line is the encoded message

Output Format:

The decoded message with all the padding characters (if any) removed.*/

import java.util.*;

public class Day_18_Cheating_Exam {
       static String Encryption(int depth , String plainText) {
        int r = depth , len = plainText.length();
        int c = (len + depth - 1)/ depth;
        char mat[][] = new char[r][c];
        int k =0;

        String cipherText = "";
        for(int i = 0;i<c;i++) {
            for(int  j =0;j<r;j++) {
                if(k <len)
                   mat[j][i] = plainText.charAt(k++);
                else 
                   mat[j][i] = 'X';
            }
        }
        for(int i =0;i<r;i++) {
            for(int j = 0;j<c;j++) {
                cipherText += mat[i][j];
            }
        }
        return cipherText;
       }

    static String Decryption(String cipherText, int depth) {
        int r = depth , len = cipherText.length();
        int c = (len + depth - 1) / depth;
        char mat[][] = new char[r][c];
        int k =0;
        String plainText = "";
        for(int i =0;i<r;i++) {
            for(int j =0;j<c;j++) {
                mat[i][j] = cipherText.charAt(k++);
            }
        }
        for(int i =0;i<c;i++) {
            for(int j =0;j<r;j++) {
                plainText += mat[j][i];
            }
        }
        while(plainText.endsWith("X")) {
            plainText = plainText.substring(0,plainText.length()-1);
        }
        return plainText;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int depth;
        String plainText , cipherText , decryptedText;
        System.out.print("Enter Plain text: ");
        plainText = in.next();
        System.out.print("Enter depth for encryption: ");
        depth = in.nextInt();
        cipherText = Encryption(depth,plainText);
        System.out.println("Encrypted text is :\n" + cipherText);
        decryptedText = Decryption(cipherText,depth);
        System.out.println("Decrypted text is :\n " + decryptedText);
        in.close();
    }

}
