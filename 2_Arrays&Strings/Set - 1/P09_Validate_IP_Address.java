/* Implement a program to validate an IPv4 Address.
 * 
 * According to Wikipedia, IPv4 addresses are canonically represented in 
 * dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255,
 *  separated by dots, e.g., 172.16.254.1
 * 
 * Approach 1 - String and Vector approach
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 */

import java.util.StringTokenizer;
public class P09_Validate_IP_Address {
    static boolean isValidIP(String s) {
        int n = s.length();
        if(n<7)
          return false;

        StringTokenizer st = new StringTokenizer(s,".");
        int count =0;
        while (st.hasMoreTokens()) {
            String substr = st.nextToken();
            count++;

            if(substr.length() > 1 && substr.charAt(0) == '0')
               return false;
            
            for(int j = 0;j<substr.length();j++) {
                if(!Character.isDigit(substr.charAt(j)))
                   return false;
            }
            if(Integer.parseInt(substr) > 255)
               return false;
        }
        if(count != 4)
           return false;
        return true;
    }
    public static void main(String[] args) {
        String s1 = "128.0.0.1";
        String s2 = "125.16.100.1";
        String s3 = "125.512.100.1";
        String s4 = "125.512.100.abc";
 
        System.out.println(isValidIP(s1) ? "Valid" : "Not valid");
        System.out.println(isValidIP(s2) ? "Valid" : "Not valid");
        System.out.println(isValidIP(s3) ? "Valid" : "Not valid");
        System.out.println(isValidIP(s4) ? "Valid" : "Not valid");
    }
}
