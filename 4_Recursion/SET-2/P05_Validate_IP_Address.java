/*Implement Code in java in which You are given a string str in the form of an IPv4 Address. Your task is to validate an IPv4 Address, if it is valid return true otherwise return false.

IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255, separated by dots, e.g., 172.16.254.1

A valid IPv4 Address is of the form x1.x2.x3.x4 where 0 <= (x1, x2, x3, x4) <= 255. Thus, we can write the generalized form of an IPv4 address as (0-255).(0-255).(0-255).(0-255)

Note: Here we are considering numbers only from 0 to 255 and any additional leading zeroes will be considered invalid.

Examples :

Input: str = 222.111.111.111
Output: true
Explanation: Here, the IPv4 address is as per the criteria mentioned and also all four decimal numbers lies in the mentioned range.

Time Compelxity : O(N)
Space Complexity : O(1)*/

import java.util.HashSet;

public class P05_Validate_IP_Address {
    public static boolean isValid(String s) {
        // Write your code here
        
        int c = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '.') c++;
        }
        if(c != 3) return false;
        
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < 256; i++) {
            set.add(Integer.toString(i));
        }
        
        int count = 0;
        String temp = "";
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '.') {
                temp += s.charAt(i);
            }
            else {
                if(set.contains(temp)) count++;
                temp = "";
            }
        }
        
        if(set.contains(temp)) count++;
        
        if(count == 4) return true;
        
        return false;
    }
public static void main(String[] args) {
    String str = "222.111.111.111";
    System.out.println(isValid(str));
}
}

